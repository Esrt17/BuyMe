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
                description = "Rendang khas Minangkabau dengan daging empuk dan bumbu rempah kaya rasa yang dimasak perlahan hingga meresap.",
                storeId = 1
            ),
            TrendingItem(
                name = "Rawon",
                price = "Rp 14.000",
                image = R.drawable.rawon,
                category = "Makanan",
                description = "Rawon khas Jawa Timur dengan kuah hitam dari kluwek, cita rasa gurih dan aroma rempah yang khas.",
                storeId = 1
            ),
            TrendingItem(
                name = "Soto",
                price = "Rp 15.000",
                image = R.drawable.soto,
                category = "Makanan",
                description = "Soto hangat dengan kuah gurih, isian daging dan sayuran segar yang cocok disantap kapan saja.",
                storeId = 1
            ),
            TrendingItem(
                name = "Sate Ayam",
                price = "Rp 20.000",
                image = R.drawable.sateayam,
                category = "Makanan",
                description = "Sate ayam empuk dengan bumbu kacang kental dan aroma bakaran yang menggugah selera.",
                storeId = 1
            ),
            TrendingItem(
                name = "Nagasari",
                price = "Rp 5.000",
                image = R.drawable.nagasari,
                category = "Makanan",
                description = "Jajanan tradisional berbahan pisang dan santan, dibungkus daun pisang dengan rasa manis lembut.",
                storeId = 1
            ),
            TrendingItem(
                name = "Onde Onde",
                price = "Rp 10.000",
                image = R.drawable.ondeonde,
                category = "Makanan",
                description = "Camilan berbentuk bulat berisi kacang hijau dengan balutan wijen yang gurih dan manis.",
                storeId = 1
            ),
            TrendingItem(
                name = "Pie Buah",
                price = "Rp 25.000",
                image = R.drawable.piebuah,
                category = "Makanan",
                description = "Pie dengan topping buah segar dan krim lembut, cocok untuk camilan manis di segala suasana.",
                storeId = 1
            ),
            TrendingItem(
                name = "Dadar Gulung",
                price = "Rp 5.000",
                image = R.drawable.dadargulung,
                category = "Makanan",
                description = "Kue tradisional berwarna hijau dengan isian kelapa manis yang lembut dan harum.",
                storeId = 1
            ),
            TrendingItem(
                name = "Opor",
                price = "Rp 15.000",
                image = R.drawable.opor,
                category = "Makanan",
                description = "Opor ayam dengan kuah santan gurih dan aroma rempah khas Nusantara.",
                storeId = 1
            ),

            // ===== MINUMAN =====
            TrendingItem(
                name = "Kunyit Asem",
                price = "Rp 5.000",
                image = R.drawable.kunyitasem,
                category = "Minuman",
                description = "Minuman herbal tradisional dari kunyit dan asam jawa yang menyegarkan dan menyehatkan.",
                storeId = 1
            ),
            TrendingItem(
                name = "Es Cendol",
                price = "Rp 8.000",
                image = R.drawable.mnm3,
                category = "Minuman",
                description = "Minuman segar dengan cendol, santan, dan gula merah cair yang manis dan menyegarkan.",
                storeId = 1
            ),
            TrendingItem(
                name = "Wedang Ronde",
                price = "Rp 8.000",
                image = R.drawable.wedangronde,
                category = "Minuman",
                description = "Minuman jahe hangat dengan isian ronde kenyal, cocok diminum saat cuaca dingin.",
                storeId = 1
            ),
            TrendingItem(
                name = "Teh",
                price = "Rp 8.000",
                image = R.drawable.mnm2,
                category = "Minuman",
                description = "Teh hangat atau dingin dengan rasa segar yang cocok diminum kapan saja.",
                storeId = 1
            ),
            TrendingItem(
                name = "Es Campur",
                price = "Rp 8.000",
                image = R.drawable.mnm4,
                category = "Minuman",
                description = "Minuman segar dengan campuran buah, jelly, dan sirup manis yang menyegarkan.",
                storeId = 1
            ),

            // ===== PAKAIAN =====
            TrendingItem(
                name = "Topi",
                price = "Rp 15.000",
                image = R.drawable.topi,
                category = "Pakaian",
                description = "Topi kasual yang nyaman dipakai dan cocok untuk melengkapi gaya sehari-hari.",
                storeId = 2
            ),
            TrendingItem(
                name = "Celana Pendek GMR",
                price = "Rp 50.000",
                image = R.drawable.pkan3,
                category = "Pakaian",
                description = "Celana pendek dengan bahan nyaman dan desain simpel untuk aktivitas santai.",
                storeId = 2
            ),
            TrendingItem(
                name = "Kemeja Rajut",
                price = "Rp 65.000",
                image = R.drawable.kemejarajut,
                category = "Pakaian",
                description = "Kemeja rajut dengan desain modern, nyaman dipakai dan cocok untuk gaya kasual.",
                storeId = 2
            ),

            // ===== AKSESORIS =====
            TrendingItem(
                name = "Belt Rajut",
                price = "Rp 55.000",
                image = R.drawable.ikatpinggang,
                category = "Aksesoris",
                description = "Ikat pinggang rajut berkualitas dengan desain unik dan kuat untuk penggunaan harian.",
                storeId = 2
            ),
            TrendingItem(
                name = "Topi",
                price = "Rp 35.000",
                image = R.drawable.topi,
                category = "Aksesoris",
                description = "Topi simpel dan stylish yang cocok digunakan untuk berbagai aktivitas.",
                storeId = 2
            ),
            TrendingItem(
                name = "Kaos Kaki Cream MTF",
                price = "Rp 15.000",
                image = R.drawable.pkan5,
                category = "Aksesoris",
                description = "Kaos kaki berbahan lembut dengan warna netral, nyaman dipakai seharian.",
                storeId = 2
            ),
            TrendingItem(
                name = "Sepatu TNG Putih MTF",
                price = "Rp 155.000",
                image = R.drawable.pkan6,
                category = "Aksesoris",
                description = "Sepatu putih dengan desain modern, nyaman digunakan untuk aktivitas sehari-hari.",
                storeId = 2
            ),
            TrendingItem(
                name = "Sepatu PNDK Putih MTF",
                price = "Rp 150.000",
                image = R.drawable.pkan7,
                category = "Aksesoris",
                description = "Sepatu pendek warna putih dengan tampilan clean dan cocok dipadukan berbagai outfit.",
                storeId = 2
            ),
        )
    }
}
