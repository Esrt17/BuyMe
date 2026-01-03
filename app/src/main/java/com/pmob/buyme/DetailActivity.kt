package com.pmob.buyme

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.pmob.buyme.data.Store

class DetailActivity : AppCompatActivity() {

    // ===== LOCATION =====
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var userLat: Double? = null
    private var userLng: Double? = null

    // ===== FAVORITE =====
    private lateinit var btnFavorite: ImageButton
    private var isFavorite = false
    private lateinit var product: TrendingItem

    private val stores = mapOf(
        1 to Store(
            "Rumah Nusantara",
            "Jl. Ki Ageng Pemanahan, Yogyakarta",
            -7.8277178,
            110.3792772
        ),
        2 to Store(
            "TinyThingsID",
            "Jl. Ngumbul Raya, Bantul",
            -7.8367153,
            110.3804488
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // ===== INIT LOCATION =====
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        getUserLocation()

        // ===== INIT VIEW =====
        btnFavorite = findViewById(R.id.btnFavorite)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvPrice = findViewById<TextView>(R.id.tvPrice)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        val ivImage = findViewById<ImageView>(R.id.ivImage)
        val tvStoreName = findViewById<TextView>(R.id.tvStoreName)
        val tvStoreLocation = findViewById<TextView>(R.id.tvStoreLocation)

        // ===== GET DATA =====
        product = intent.getParcelableExtra("ITEM")
            ?: run {
                finish()
                return
            }

        Log.d("DETAIL", "Product ID: ${product.id}")

        tvName.text = product.name
        tvPrice.text = product.price
        tvDescription.text = product.description
        ivImage.setImageResource(product.image)

        // ===== STORE =====
        val store = stores[product.storeId]
        store?.let {
            tvStoreName.text = it.name
            tvStoreLocation.text = it.location
        }

        // ===== MAPS DIRECTION =====
        tvStoreLocation.setOnClickListener {
            if (userLat == null || userLng == null || store == null) {
                Toast.makeText(this, "Lokasi belum tersedia", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val uri = Uri.parse(
                "https://www.google.com/maps/dir/?api=1" +
                        "&origin=$userLat,$userLng" +
                        "&destination=${store.lat},${store.lng}" +
                        "&travelmode=driving"
            )

            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

        // ===== LOGIN CHECK =====
        val user = FirebaseAuth.getInstance().currentUser
        if (user == null) {
            btnFavorite.isEnabled = false
            btnFavorite.setImageResource(R.drawable.ic_favorite_border)
            Toast.makeText(this, "Silakan login untuk favorit", Toast.LENGTH_SHORT).show()
            return
        }

        // ===== RESET STATE (WAJIB) =====
        isFavorite = false
        btnFavorite.setImageResource(R.drawable.ic_favorite_border)

        // ===== CEK FAVORITE =====
        checkFavoriteStatus(product.id)

        btnFavorite.setOnClickListener {
            if (isFavorite) {
                removeFavorite(product.id)
            } else {
                saveFavorite(product)
            }
        }
    }

    // ================= LOCATION =================
    private fun getUserLocation() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                100
            )
            return
        }

        fusedLocationClient.lastLocation
            .addOnSuccessListener { location ->
                location?.let {
                    userLat = it.latitude
                    userLng = it.longitude
                }
            }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 100 &&
            grantResults.isNotEmpty() &&
            grantResults[0] == PackageManager.PERMISSION_GRANTED
        ) {
            getUserLocation()
        }
    }

    // ================= FAVORITE =================
    private fun saveFavorite(product: TrendingItem) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return

        val favoriteData = mapOf(
            "id" to product.id,
            "name" to product.name,
            "price" to product.price,
            "category" to product.category
        )

        FirebaseDatabase.getInstance()
            .getReference("favorites")
            .child(userId)
            .child(product.id)
            .setValue(favoriteData)
            .addOnSuccessListener {
                isFavorite = true
                btnFavorite.setImageResource(R.drawable.ic_favorite_filled)
                Log.d("FAVORITE", "Added ${product.id}")
            }
    }

    private fun removeFavorite(productId: String) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return

        FirebaseDatabase.getInstance()
            .getReference("favorites")
            .child(userId)
            .child(productId)
            .removeValue()
            .addOnSuccessListener {
                isFavorite = false
                btnFavorite.setImageResource(R.drawable.ic_favorite_border)
                Log.d("FAVORITE", "Removed $productId")
            }
    }

    private fun checkFavoriteStatus(productId: String) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return

        FirebaseDatabase.getInstance()
            .getReference("favorites")
            .child(userId)
            .child(productId)
            .get()
            .addOnSuccessListener { snapshot ->
                isFavorite = snapshot.exists()
                btnFavorite.setImageResource(
                    if (isFavorite)
                        R.drawable.ic_favorite_filled
                    else
                        R.drawable.ic_favorite_border
                )
            }
            .addOnFailureListener {
                isFavorite = false
                btnFavorite.setImageResource(R.drawable.ic_favorite_border)
            }
    }
}
