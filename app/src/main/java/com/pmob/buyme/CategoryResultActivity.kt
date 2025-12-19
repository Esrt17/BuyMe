package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_result)

        // 1️⃣ Ambil RecyclerView
        val rvResult = findViewById<RecyclerView>(R.id.rvResult)

        // 2️⃣ Ambil kategori dari Intent
        val selectedCategory = intent.getStringExtra("CATEGORY")

        // 3️⃣ Ambil semua data lalu filter
        val filteredItems = DummyData.getTrending().filter {
            it.category == selectedCategory
        }

        // 4️⃣ Set RecyclerView
        rvResult.layoutManager = GridLayoutManager(this, 2)
        rvResult.adapter = TrendingAdapter(filteredItems) { item ->
            openDetail(item)
        }
    }

    private fun openDetail(item: TrendingItem) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("ITEM", item)
        startActivity(intent)
    }
}
