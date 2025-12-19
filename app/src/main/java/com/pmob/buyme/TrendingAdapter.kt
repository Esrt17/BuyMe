package com.pmob.buyme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrendingAdapter(
    private val list: List<TrendingItem>,
    private val onClick: (TrendingItem) -> Unit
) : RecyclerView.Adapter<TrendingAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.imgProduct)
        val name: TextView = itemView.findViewById(R.id.tvName)
        val price: TextView = itemView.findViewById(R.id.tvPrice)
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val btnPlus: ImageView = view.findViewById(R.id.btnPlus)
        val btnMinus: ImageView = view.findViewById(R.id.btnMinus)
        val tvQty: TextView = view.findViewById(R.id.tvQty)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_trending, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvName.text = item.name
        holder.tvPrice.text = item.price
        holder.img.setImageResource(item.image)

        holder.tvQty.text = item.qty.toString()

        holder.btnPlus.setOnClickListener {
            item.qty++
            holder.tvQty.text = item.qty.toString()
        }

        holder.btnMinus.setOnClickListener {
            if (item.qty > 0) {
                item.qty--
                holder.tvQty.text = item.qty.toString()
            }
        }
    }


    override fun getItemCount(): Int = list.size
}
