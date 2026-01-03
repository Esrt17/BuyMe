package com.pmob.buyme

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class TrendingItem(
    val id: String = "",
    val name: String = "",
    val price: String = "",
    val image: Int = 0,
    val category: String = "",
    val description: String = "",
    val storeId: Int = 0
) : Parcelable




