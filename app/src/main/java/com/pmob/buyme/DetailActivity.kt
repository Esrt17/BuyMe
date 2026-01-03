package com.pmob.buyme

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.pmob.buyme.data.Store


class DetailActivity : AppCompatActivity() {

    private lateinit var btnFavorite: ImageButton
    private var isFavorite = false

    private lateinit var product: TrendingItem

    private val stores = mapOf(
        1 to Store(
            "Rumah Nusantara",
            "Jl. Ki Ageng Pemanahan, RT.64/RW.14, Sorosutan, Kec. Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55162",
            -7.8277178,
            110.3792772
        ),
        2 to Store(
            "TinyThingsID",
            "Jl. Ngumbul Raya, Tamanan, Kec. Banguntapan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55191",
            -7.8367153,
            110.3804488
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // === INIT VIEW ===
        btnFavorite = findViewById(R.id.btnFavorite)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvPrice = findViewById<TextView>(R.id.tvPrice)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        val ivImage = findViewById<ImageView>(R.id.ivImage)
        val tvStoreName = findViewById<TextView>(R.id.tvStoreName)
        val tvStoreLocation = findViewById<TextView>(R.id.tvStoreLocation)

        // === AMBIL DATA DARI INTENT ===
        product = intent.getParcelableExtra("ITEM")!!
        val store = stores[product.storeId]


        // === SET DATA KE UI ===
        tvName.text = product.name
        tvPrice.text = product.price
        tvDescription.text = product.description
        ivImage.setImageResource(product.image)

        // === SET STORE ===
        store?.let {
            tvStoreName.text = it.name
            tvStoreLocation.text = it.location
        }

        // === KLIK LOKASI → GOOGLE MAPS ===
        tvStoreLocation.setOnClickListener {
            store?.let {
                val uri = Uri.parse(
                    "geo:${it.lat},${it.lng}?q=${it.lat},${it.lng}(${it.name})"
                )
                val intent = Intent(Intent.ACTION_VIEW, uri)
                intent.setPackage("com.google.android.apps.maps")
                startActivity(intent)
            }
        }

        // === CEK STATUS FAVORITE ===
        checkFavoriteStatus(product.id)

        val database = FirebaseDatabase.getInstance()
        val favoriteRef = database.getReference("favorites")

        ensureAnonymousLogin()

        // === KLIK BUTTON FAVORITE ===
        btnFavorite.setOnClickListener {
            if (isFavorite) {
                removeFavorite(product.id)
                btnFavorite.setImageResource(R.drawable.ic_favorite_border)
                isFavorite = false
            } else {
                saveFavorite(product)
                btnFavorite.setImageResource(R.drawable.ic_favorite_filled)
                isFavorite = true
            }
        }
    }

    private fun ensureAnonymousLogin() {
        val auth = FirebaseAuth.getInstance()

        if (auth.currentUser == null) {
            auth.signInAnonymously()
                .addOnSuccessListener {
                    // Login berhasil
                }
                .addOnFailureListener {
                    // Login gagal (biasanya karena Anonymous belum diaktifkan)
                }
        }
    }


    // ================= FIREBASE =================

    private fun saveFavorite(product: TrendingItem) {
        val user = FirebaseAuth.getInstance().currentUser

        if (user == null) {
            Log.d("FAVORITE", "USER BELUM LOGIN")
            return
        }

        val userId = user.uid

        val favoriteData = mapOf(
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
                Log.d("FAVORITE", "DATA MASUK FIREBASE")
            }
    }

    private fun removeFavorite(productId: String) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return

        FirebaseDatabase.getInstance()
            .getReference("favorites")
            .child(userId)
            .child(productId)
            .removeValue()
    }

    private fun checkFavoriteStatus(productId: String) {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return

        FirebaseDatabase.getInstance()
            .getReference("favorites")
            .child(userId)
            .child(productId)
            .get()
            .addOnSuccessListener {
                isFavorite = it.exists()
                btnFavorite.setImageResource(
                    if (isFavorite)
                        R.drawable.ic_favorite_filled
                    else
                        R.drawable.ic_favorite_border
                )
            }
    }
}



