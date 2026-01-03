package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvTrending: RecyclerView
    private lateinit var rvCategory: RecyclerView
    private lateinit var btnFavoritePage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // INIT VIEW
        rvTrending = findViewById(R.id.rvTrending)
        rvCategory = findViewById(R.id.rvCategory)
        btnFavoritePage = findViewById(R.id.btnFavoritePage)

        setupCategory()
        setupTrending()
        setupFavoriteButton()
    }

    // ================= CATEGORY =================
    private fun setupCategory() {
        rvCategory.layoutManager = GridLayoutManager(this, 4)
        rvCategory.setHasFixedSize(true)

        rvCategory.adapter = CategoryAdapter(getDummyCategory()) { category ->
            val intent = Intent(this, CategoryResultActivity::class.java)
            intent.putExtra("CATEGORY", category.name)
            startActivity(intent)
        }
    }

    // ================= TRENDING =================
    private fun setupTrending() {
        rvTrending.layoutManager = GridLayoutManager(this, 2)
        rvTrending.setHasFixedSize(true)

        rvTrending.adapter = TrendingAdapter(getDummyTrending()) { item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("ITEM", item)
            startActivity(intent)
        }
    }

    // ================= FAVORITE PAGE =================
    private fun setupFavoriteButton() {
        btnFavoritePage.setOnClickListener {
            startActivity(Intent(this, FavoriteActivity::class.java))
        }
    }

    // ================= DUMMY DATA =================
    private fun getDummyCategory(): List<Category> {
        return listOf(
            Category("Makanan", R.drawable.makanan),
            Category("Minuman", R.drawable.minuman),
            Category("Pakaian", R.drawable.pakaian),
            Category("Aksesoris", R.drawable.kerajinan)
        )
    }

    private fun getDummyTrending(): List<TrendingItem> {
        return listOf(
            TrendingItem(
                id = "rendang_001",
                name = "Rendang",
                price = "Rp 15.000",
                image = R.drawable.rendang,
                category = "Makanan",
                description = "Rendang khas Padang yang dimasak perlahan dengan rempah-rempah pilihan, menghasilkan cita rasa gurih, pedas, dan kaya bumbu yang meresap hingga ke dalam daging.",
                storeId = 1
            ),
            TrendingItem(
                id = "pajangan_001",
                name = "Pajangan Dinding",
                price = "Rp 35.000",
                image = R.drawable.pajangan,
                category = "Aksesoris",
                description = "Pajangan dinding handmade dengan sentuhan seni unik, cocok untuk mempercantik ruangan dan memberi kesan estetik pada rumah Anda.",
                storeId = 1
            ),
            TrendingItem(
                id = "nagasari_001",
                name = "Nagasari",
                price = "Rp 2.000",
                image = R.drawable.nagasari,
                category = "Makanan",
                description = "Jajanan tradisional berbahan dasar pisang dan santan yang dibungkus daun pisang, memiliki rasa manis dan tekstur lembut.",
                storeId = 1
            ),
            TrendingItem(
                id = "belt_rajut_001",
                name = "Belt Rajut",
                price = "Rp 50.000",
                image = R.drawable.ikatpinggang,
                category = "Aksesoris",
                description = "Ikat pinggang rajut handmade dengan bahan berkualitas tinggi, kuat, nyaman dipakai, dan cocok untuk berbagai gaya fashion.",
                storeId = 2
            ),
            TrendingItem(
                id = "rawon_001",
                name = "Rawon",
                price = "Rp 14.000",
                image = R.drawable.rawon,
                category = "Makanan",
                description = "Rawon khas Jawa Timur dengan kuah hitam dari kluwek, bercita rasa gurih dan kaya rempah, disajikan dengan daging empuk.",
                storeId = 1,
            ),
            TrendingItem(
                id = "wedang_ronde_001",
                name = "Wedang Ronde",
                price = "Rp 10.000",
                image = R.drawable.wedangronde,
                category = "Minuman",
                description = "Minuman jahe hangat dengan isian ronde kenyal dan kacang, cocok dinikmati saat cuaca dingin untuk menghangatkan tubuh.",
                storeId = 1
            ),
            TrendingItem(
                id = "kemeja_rajut_001",
                name = "Kemeja Rajut",
                price = "Rp 130.000",
                image = R.drawable.kemejarajut,
                category = "Pakaian",
                description = "Kemeja rajut premium dengan desain modern, nyaman dipakai, dan cocok digunakan untuk acara santai maupun semi formal.",
                storeId = 2
            ),
            TrendingItem(
                id = "kunyit_asem_001",
                name = "Kunyit Asem",
                price = "Rp 13.000",
                image = R.drawable.kunyitasem,
                category = "Minuman",
                description = "Minuman herbal tradisional berbahan kunyit dan asam jawa yang menyegarkan serta dikenal baik untuk kesehatan tubuh.",
                storeId = 1
            )
        )
    }
}

