package com.pmob.buyme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class FavoriteActivity : AppCompatActivity() {

    private lateinit var rvFavorite: RecyclerView
    private lateinit var adapter: FavoriteAdapter
    private val favoriteList = mutableListOf<FavoriteItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        rvFavorite = findViewById(R.id.rvFavorite)
        rvFavorite.layoutManager = LinearLayoutManager(this)

        adapter = FavoriteAdapter(favoriteList)
        rvFavorite.adapter = adapter

        loadFavorites()
    }

    private fun loadFavorites() {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return

        FirebaseDatabase.getInstance()
            .getReference("favorites")
            .child(userId)
            .get()
            .addOnSuccessListener { snapshot ->
                favoriteList.clear()

                for (data in snapshot.children) {
                    val item = data.getValue(FavoriteItem::class.java)
                    if (item != null) {
                        favoriteList.add(item.copy(id = data.key ?: ""))
                    }
                }
                adapter.notifyDataSetChanged()
            }
    }
}
