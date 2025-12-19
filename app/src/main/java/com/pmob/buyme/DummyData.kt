package com.pmob.buyme

object DummyData {

    fun getTrending(): List<TrendingItem> {
        return listOf(

            // ===== MAKANAN =====
            TrendingItem(
                name = "Rendang",
                price = "Rp 15.000",
                image = R.drawable.rendang,
                category = "Makanan",
                description = "Rendang khas Minangkabau dengan bumbu rempah yang kaya."
            ),
            TrendingItem(
                name = "Rawon",
                price = "Rp 14.000",
                image = R.drawable.rawon,
                category = "Makanan",
                description = "Rawon Jawa Timur dengan kuah hitam dari kluwek."
            ),
            TrendingItem(
                name = "Soto",
                price = "Rp 15.000",
                image = R.drawable.soto,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),
            TrendingItem(
                name = "Sate Ayam",
                price = "Rp 20.000",
                image = R.drawable.sateayam,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),
            TrendingItem(
                name = "Nagasari",
                price = "Rp 5.000",
                image = R.drawable.nagasari,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),
            TrendingItem(
                name = "Onde Onde",
                price = "Rp 10.000",
                image = R.drawable.ondeonde,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),
            TrendingItem(
                name = "Pie Buah",
                price = "Rp 25.000",
                image = R.drawable.piebuah,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),
            TrendingItem(
                name = "Dadar Gulung",
                price = "Rp 5.000",
                image = R.drawable.dadargulung,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),
            TrendingItem(
                name = "Opor",
                price = "Rp 15.000",
                image = R.drawable.opor,
                category = "Makanan",
                description = "Sate ayam dengan bumbu kacang khas."
            ),

            // ===== MINUMAN =====
            TrendingItem(
                name = "Kunyit Asem",
                price = "Rp 5.000",
                image = R.drawable.kunyitasem,
                category = "Minuman",
                description = "Es teh manis segar pelepas dahaga."
            ),
            TrendingItem(
                name = "Es Cendol",
                price = "Rp 8.000",
                image = R.drawable.mnm3,
                category = "Minuman",
                description = "Kopi hitam tanpa gula dengan aroma kuat."
            ),
            TrendingItem(
                name = "Wedang Ronde",
                price = "Rp 8.000",
                image = R.drawable.wedangronde,
                category = "Minuman",
                description = "Kopi hitam tanpa gula dengan aroma kuat."
            ),
            TrendingItem(
                name = "Teh",
                price = "Rp 8.000",
                image = R.drawable.mnm2,
                category = "Minuman",
                description = "Kopi hitam tanpa gula dengan aroma kuat."
            ),
            TrendingItem(
                name = "Es Campur",
                price = "Rp 8.000",
                image = R.drawable.mnm4,
                category = "Minuman",
                description = "Kopi hitam tanpa gula dengan aroma kuat."
            ),

            // ===== PAKAIAN =====
            TrendingItem(
                name = "Topi",
                price = "Rp 15.000",
                image = R.drawable.topi,
                category = "Pakaian",
                description = "Pisang goreng crispy dan manis."
            ),
            TrendingItem(
                name = "Celana Pendek GMR",
                price = "Rp 50.000",
                image = R.drawable.pkan3,
                category = "Pakaian",
                description = "Tahu goreng tepung renyah."
            ),
            TrendingItem(
                name = "Kemeja Rajut",
                price = "Rp 65.000",
                image = R.drawable.kemejarajut,
                category = "Pakaian",
                description = "Tahu goreng tepung renyah."
            ),


            // ===== AKSESORIS =====
            TrendingItem(
                name = "Belt Rajut",
                price = "Rp 55.000",
                image = R.drawable.ikatpinggang,
                category = "Aksesoris",
                description = "Rendang khas Minangkabau dengan bumbu rempah yang kaya."
            ),
            TrendingItem(
                name = "Topi",
                price = "Rp 35.000",
                image = R.drawable.topi,
                category = "Aksesoris",
                description = "Rendang khas Minangkabau dengan bumbu rempah yang kaya."
            ),
            TrendingItem(
                name = "Kaos Kaki Cream MTF",
                price = "Rp 15.000",
                image = R.drawable.pkan5,
                category = "Aksesoris",
                description = "Rendang khas Minangkabau dengan bumbu rempah yang kaya."
            ),
            TrendingItem(
                name = "Sepatu TNG Putih MTF",
                price = "Rp 155.000",
                image = R.drawable.pkan6,
                category = "Aksesoris",
                description = "Rendang khas Minangkabau dengan bumbu rempah yang kaya."
            ),
            TrendingItem(
                name = "Sepatu PNDK Putih MTF",
                price = "Rp 150.000",
                image = R.drawable.pkan7,
                category = "Aksesoris",
                description = "Rendang khas Minangkabau dengan bumbu rempah yang kaya."
            ),
        )
    }
}
