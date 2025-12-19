package com.pmob.buyme

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvPrice = findViewById<TextView>(R.id.tvPrice)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        val ivImage = findViewById<ImageView>(R.id.ivImage)

        val item = intent.getParcelableExtra<TrendingItem>("ITEM")

        tvName.text = item?.name
        tvPrice.text = item?.price
        tvDescription.text = item?.description
        ivImage.setImageResource(item!!.image)
    }
}


