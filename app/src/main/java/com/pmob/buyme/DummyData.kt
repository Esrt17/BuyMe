package com.pmob.buyme

object DummyData {

    fun getTrending(): List<TrendingItem> {
        return listOf(

            // ===== MAKANAN =====
            TrendingItem(
                name = "Rendang",
                price = "Rp 15.000",
                image = R.drawable.rrendang,
                category = "Makanan",
                description = "Rendang khas Minangkabau dengan daging empuk dan bumbu rempah kaya rasa yang dimasak perlahan hingga meresap.",
                storeId = 1
            ),
            TrendingItem(
                name = "Rawon",
                price = "Rp 14.000",
                image = R.drawable.rrawon,
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
                name = "Ayam Betutu",
                price = "Rp 86.000",
                image = R.drawable.ayambetutu,
                category = "Makanan",
                description = "Masakan khas Bali berupa ayam utuh yang dimasak dengan bumbu rempah khas Bali, bercita rasa pedas dan aromatik.",
                storeId = 1
            ),
            TrendingItem(
                name = "Kerak Telor",
                price = "Rp 25.000",
                image = R.drawable.keraktelor,
                category = "Makanan",
                description = "Makanan khas Betawi (Jakarta) berbahan beras ketan, telur, dan serundeng kelapa dengan rasa gurih dan khas.",
                storeId = 1
            ),
            TrendingItem(
                name = "Mie Aceh",
                price = "Rp 20.000",
                image = R.drawable.miaceh,
                category = "Makanan",
                description = "Hidangan khas Aceh berupa mie tebal dengan bumbu kari rempah yang kuat, disajikan dengan daging atau seafood.",
                storeId = 1
            ),
            TrendingItem(
                name = "Papeda",
                price = "Rp 15.000",
                image = R.drawable.ppapeda,
                category = "Makanan",
                description = "Makanan pokok khas Papua dan Maluku berupa bubur sagu dengan tekstur kenyal, biasanya disajikan dengan ikan kuah kuning.",
                storeId = 1
            ),
            TrendingItem(
                name = "Pempek",
                price = "Rp 10.000",
                image = R.drawable.ppempek,
                category = "Makanan",
                description = "Makanan khas Palembang berbahan ikan dan tepung sagu, disajikan dengan kuah cuko yang asam, manis, dan pedas.",
                storeId = 1
            ),
            TrendingItem(
                name = "Soto Banjar",
                price = "Rp 20.000",
                image = R.drawable.sotobanjar,
                category = "Makanan",
                description = "Soto khas Kalimantan Selatan dengan kuah bening gurih, ayam suwir, telur, dan aroma rempah yang lembut.",
                storeId = 1
            ),
            TrendingItem(
                name = "Sate Lilit",
                price = "Rp 20.000",
                image = R.drawable.satelilit,
                category = "Makanan",
                description = "Sate khas Bali berbahan daging cincang yang dililitkan pada batang serai, bercita rasa gurih dan rempah yang kuat.",
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
                name = "Cermin",
                price = "Rp 100.000",
                image = R.drawable.cermindinding,
                category = "Aksesoris",
                description = "Cermin dinding dengan desain minimalis yang cocok untuk mempercantik ruangan dan memberikan kesan luas.",
                storeId = 2
            ),
            TrendingItem(
                name = "Asbak",
                price = "Rp 65.000",
                image = R.drawable.asbakkayu,
                category = "Aksesoris",
                description = "Asbak kayu dengan tampilan natural, kuat, dan cocok digunakan di dalam maupun luar ruangan.",
                storeId = 2
            ),
            TrendingItem(
                name = "Dompet Kulit",
                price = "Rp 95.000",
                image = R.drawable.dompetkulit,
                category = "Aksesoris",
                description = "Dompet kulit berkualitas dengan desain elegan, dilengkapi banyak slot kartu dan ruang penyimpanan uang.",
                storeId = 2
            ),
            TrendingItem(
                name = "Gantungan Kunci",
                price = "Rp 15.000",
                image = R.drawable.gantungankunci,
                category = "Aksesoris",
                description = "Gantungan kunci unik dan ringan, cocok sebagai aksesoris tas atau kunci kendaraan.",
                storeId = 2
            ),
            TrendingItem(
                name = "Gelang",
                price = "Rp 15.000",
                image = R.drawable.gelangmanikmanik,
                category = "Aksesoris",
                description = "Gelang manik-manik dengan desain sederhana dan menarik, cocok digunakan sehari-hari atau sebagai hadiah.",
                storeId = 2
            ),
            TrendingItem(
                name = "Sepatu TNG Putih MTF",
                price = "Rp 155.000",
                image = R.drawable.pkan6,
                category = "Aksesoris",
                description = "Sepatu putih model tinggi dengan desain modern, nyaman dipakai dan cocok untuk berbagai aktivitas kasual.",
                storeId = 2
            ),
            TrendingItem(
                name = "Sepatu PNDK Putih MTF",
                price = "Rp 150.000",
                image = R.drawable.pkan7,
                category = "Aksesoris",
                description = "Sepatu putih model pendek dengan tampilan clean, mudah dipadukan dengan berbagai gaya berpakaian.",
                storeId = 2
            ),
            TrendingItem(
                name = "Jam Dinding",
                price = "Rp 155.000",
                image = R.drawable.jamdinding,
                category = "Aksesoris",
                description = "Jam dinding dengan desain modern dan angka jelas, cocok untuk ruang tamu, kamar, maupun kantor.",
                storeId = 2
            ),
            )
    }
}
