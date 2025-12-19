package com.pmob.buyme

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TrendingItem(
    val name: String,
    val price: String,
    val image: Int,
    val category: String,
    val description: String,
    var qty: Int = 0
) : Parcelable




