package com.pmob.buyme

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TrendingItem(
    val id: String = "",
    val name: String,
    val price: String,
    val image: Int,
    val category: String,
    val description: String,
    val address: String = " ",
    val storeId: Int ,
) : Parcelable




