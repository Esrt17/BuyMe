package com.pmob.buyme

object DummyData {

    fun getTrending(): List<TrendingItem> {
        return listOf(

            // ===== MAKANAN =====
            TrendingItem(
                id = "makanan_rendang_001",
                name = "Rendang",
                price = "Rp 15.000",
                image = R.drawable.rrendang,
                category = "Makanan",
                description = "Rendang khas Minangkabau dengan daging empuk dan bumbu rempah kaya rasa yang dimasak perlahan hingga meresap.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_rawon_001",
                name = "Rawon",
                price = "Rp 14.000",
                image = R.drawable.rrawon,
                category = "Makanan",
                description = "Rawon khas Jawa Timur dengan kuah hitam dari kluwek, cita rasa gurih dan aroma rempah yang khas.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_soto_001",
                name = "Soto",
                price = "Rp 15.000",
                image = R.drawable.soto,
                category = "Makanan",
                description = "Soto hangat dengan kuah gurih, isian daging dan sayuran segar.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_sate_ayam_001",
                name = "Sate Ayam",
                price = "Rp 20.000",
                image = R.drawable.sateayam,
                category = "Makanan",
                description = "Sate ayam empuk dengan bumbu kacang kental dan aroma bakaran.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_ayam_betutu_001",
                name = "Ayam Betutu",
                price = "Rp 86.000",
                image = R.drawable.ayambetutu,
                category = "Makanan",
                description = "Masakan khas Bali berupa ayam utuh dengan bumbu rempah khas.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_kerak_telor_001",
                name = "Kerak Telor",
                price = "Rp 25.000",
                image = R.drawable.keraktelor,
                category = "Makanan",
                description = "Makanan khas Betawi berbahan ketan dan telur.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_mie_aceh_001",
                name = "Mie Aceh",
                price = "Rp 20.000",
                image = R.drawable.miaceh,
                category = "Makanan",
                description = "Mie khas Aceh dengan bumbu kari rempah kuat.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_papeda_001",
                name = "Papeda",
                price = "Rp 15.000",
                image = R.drawable.ppapeda,
                category = "Makanan",
                description = "Makanan khas Papua dari sagu.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_pempek_001",
                name = "Pempek",
                price = "Rp 10.000",
                image = R.drawable.ppempek,
                category = "Makanan",
                description = "Pempek khas Palembang dengan kuah cuko.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_soto_banjar_001",
                name = "Soto Banjar",
                price = "Rp 20.000",
                image = R.drawable.sotobanjar,
                category = "Makanan",
                description = "Soto khas Kalimantan Selatan.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_sate_lilit_001",
                name = "Sate Lilit",
                price = "Rp 20.000",
                image = R.drawable.satelilit,
                category = "Makanan",
                description = "Sate khas Bali dengan daging cincang.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_nagasari_001",
                name = "Nagasari",
                price = "Rp 5.000",
                image = R.drawable.nagasari,
                category = "Makanan",
                description = "Jajanan tradisional pisang dan santan.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_onde_onde_001",
                name = "Onde Onde",
                price = "Rp 10.000",
                image = R.drawable.ondeonde,
                category = "Makanan",
                description = "Camilan bulat isi kacang hijau.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_pie_buah_001",
                name = "Pie Buah",
                price = "Rp 25.000",
                image = R.drawable.piebuah,
                category = "Makanan",
                description = "Pie dengan topping buah segar.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_dadar_gulung_001",
                name = "Dadar Gulung",
                price = "Rp 5.000",
                image = R.drawable.dadargulung,
                category = "Makanan",
                description = "Kue tradisional isi kelapa manis.",
                storeId = 1
            ),
            TrendingItem(
                id = "makanan_opor_001",
                name = "Opor",
                price = "Rp 15.000",
                image = R.drawable.opor,
                category = "Makanan",
                description = "Opor ayam kuah santan gurih.",
                storeId = 1
            ),

            // ===== MINUMAN =====
            TrendingItem(
                id = "minuman_kunyit_asem_001",
                name = "Kunyit Asem",
                price = "Rp 5.000",
                image = R.drawable.kunyitasem,
                category = "Minuman",
                description = "Minuman herbal tradisional.",
                storeId = 1
            ),
            TrendingItem(
                id = "minuman_es_cendol_001",
                name = "Es Cendol",
                price = "Rp 8.000",
                image = R.drawable.mnm3,
                category = "Minuman",
                description = "Minuman segar dengan gula merah.",
                storeId = 1
            ),
            TrendingItem(
                id = "minuman_wedang_ronde_001",
                name = "Wedang Ronde",
                price = "Rp 8.000",
                image = R.drawable.wedangronde,
                category = "Minuman",
                description = "Minuman jahe hangat.",
                storeId = 1
            ),
            TrendingItem(
                id = "minuman_teh_001",
                name = "Teh",
                price = "Rp 8.000",
                image = R.drawable.mnm2,
                category = "Minuman",
                description = "Teh hangat atau dingin.",
                storeId = 1
            ),
            TrendingItem(
                id = "minuman_es_campur_001",
                name = "Es Campur",
                price = "Rp 8.000",
                image = R.drawable.mnm4,
                category = "Minuman",
                description = "Minuman segar campuran buah.",
                storeId = 1
            ),

            // ===== PAKAIAN =====
            TrendingItem(
                id = "pakaian_topi_001",
                name = "Topi",
                price = "Rp 15.000",
                image = R.drawable.topi,
                category = "Pakaian",
                description = "Topi kasual.",
                storeId = 2
            ),
            TrendingItem(
                id = "pakaian_celana_pendek_001",
                name = "Celana Pendek GMR",
                price = "Rp 50.000",
                image = R.drawable.pkan3,
                category = "Pakaian",
                description = "Celana pendek nyaman.",
                storeId = 2
            ),
            TrendingItem(
                id = "pakaian_kemeja_rajut_001",
                name = "Kemeja Rajut",
                price = "Rp 65.000",
                image = R.drawable.kemejarajut,
                category = "Pakaian",
                description = "Kemeja rajut modern.",
                storeId = 2
            ),

            // ===== AKSESORIS =====
            TrendingItem(
                id = "aksesoris_belt_rajut_001",
                name = "Belt Rajut",
                price = "Rp 55.000",
                image = R.drawable.ikatpinggang,
                category = "Aksesoris",
                description = "Ikat pinggang rajut.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_cermin_001",
                name = "Cermin",
                price = "Rp 100.000",
                image = R.drawable.cermindinding,
                category = "Aksesoris",
                description = "Cermin dinding minimalis.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_asbak_001",
                name = "Asbak",
                price = "Rp 65.000",
                image = R.drawable.asbakkayu,
                category = "Aksesoris",
                description = "Asbak kayu.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_dompet_kulit_001",
                name = "Dompet Kulit",
                price = "Rp 95.000",
                image = R.drawable.dompetkulit,
                category = "Aksesoris",
                description = "Dompet kulit elegan.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_gantungan_kunci_001",
                name = "Gantungan Kunci",
                price = "Rp 15.000",
                image = R.drawable.gantungankunci,
                category = "Aksesoris",
                description = "Gantungan kunci unik.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_gelang_001",
                name = "Gelang",
                price = "Rp 15.000",
                image = R.drawable.gelangmanikmanik,
                category = "Aksesoris",
                description = "Gelang manik-manik.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_sepatu_tinggi_001",
                name = "Sepatu TNG Putih MTF",
                price = "Rp 155.000",
                image = R.drawable.pkan6,
                category = "Aksesoris",
                description = "Sepatu putih model tinggi.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_sepatu_pendek_001",
                name = "Sepatu PNDK Putih MTF",
                price = "Rp 150.000",
                image = R.drawable.pkan7,
                category = "Aksesoris",
                description = "Sepatu putih model pendek.",
                storeId = 2
            ),
            TrendingItem(
                id = "aksesoris_jam_dinding_001",
                name = "Jam Dinding",
                price = "Rp 155.000",
                image = R.drawable.jamdinding,
                category = "Aksesoris",
                description = "Jam dinding modern.",
                storeId = 2
            )
        )
    }
}
