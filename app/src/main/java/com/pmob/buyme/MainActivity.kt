package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvTrending: RecyclerView
    private lateinit var rvCategory: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTrending = findViewById(R.id.rvTrending)
        rvCategory = findViewById(R.id.rvCategory)

        setupCategory()
        setupTrending()
    }

    private fun setupCategory() {
        rvCategory.layoutManager = GridLayoutManager(this, 4)
        rvCategory.setHasFixedSize(true)
        rvCategory.adapter = CategoryAdapter(getDummyCategory()) { category ->
            val intent = Intent(this, CategoryResultActivity::class.java)
            intent.putExtra("CATEGORY", category.name)
            startActivity(intent)
        }

    }

    private fun setupTrending() {
        rvTrending.layoutManager = GridLayoutManager(this, 2)
        rvTrending.setHasFixedSize(true)

        rvTrending.adapter = TrendingAdapter(getDummyTrending()) { item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("ITEM", item)
            startActivity(intent)
        }
    }


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
                "Rendang",
                "Rp 15.000",
                R.drawable.rendang,
                "Makanan",
                "Rendang khas Padang dengan bumbu rempah"
            ),
            TrendingItem(
                "Pajangan Dinding",
                "Rp 35.000",
                R.drawable.pajangan,
                "Aksesoris",
                "Pajangan rumah handmade"
            ),
            TrendingItem(
                "Nagasari",
                "Rp 2.000",
                R.drawable.nagasari,
                "Makanan",
                "Jajanan tradisional berbahan pisang"
            ),
            TrendingItem(
                "Belt Rajut",
                "Rp 50.000",
                R.drawable.ikatpinggang,
                "Aksesoris",
                "Ikat pinggang rajut handmade"
            ),
            TrendingItem(
                "Rawon",
                "Rp 14.000",
                R.drawable.rawon,
                "Makanan",
                "Rawon khas Jawa Timur"
            ),
            TrendingItem(
                "Wedang Ronde",
                "Rp 10.000",
                R.drawable.wedangronde,
                "Minuman",
                "Minuman jahe hangat"
            ),
            TrendingItem(
                "Kemeja Rajut",
                "Rp 130.000",
                R.drawable.kemejarajut,
                "Pakaian",
                "Kemeja rajut premium"
            ),
            TrendingItem(
                "Kunyit Asem",
                "Rp 13.000",
                R.drawable.kunyitasem,
                "Minuman",
                "Minuman herbal tradisional"
            )
        )
    }
}
