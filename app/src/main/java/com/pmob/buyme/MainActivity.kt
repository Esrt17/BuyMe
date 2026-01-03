package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvTrending: RecyclerView
    private lateinit var rvCategory: RecyclerView
    private lateinit var btnFavoritePage: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ambil tombol logout dari XML
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // KODE LOGOUT TARUH DI SINI ⬇️
        btnLogout.setOnClickListener {
            val pref = getSharedPreferences("LOGIN", MODE_PRIVATE)
            pref.edit().clear().apply()

            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        // INIT VIEW
        rvTrending = findViewById(R.id.rvTrending)
        rvCategory = findViewById(R.id.rvCategory)
        btnFavoritePage = findViewById(R.id.btnFavoritePage)

        setupCategory()
        setupTrending()
        setupFavoriteButton()
    }

    // ================= CATEGORY =================
    private fun setupCategory() {
        rvCategory.layoutManager = GridLayoutManager(this, 4)
        rvCategory.setHasFixedSize(true)

        rvCategory.adapter = CategoryAdapter(getDummyCategory()) { category ->
            val intent = Intent(this, CategoryResultActivity::class.java)
            intent.putExtra("CATEGORY", category.name)
            startActivity(intent)
        }
    }

    // ================= TRENDING =================
    private fun setupTrending() {
        rvTrending.layoutManager = GridLayoutManager(this, 2)
        rvTrending.setHasFixedSize(true)

        rvTrending.adapter = TrendingAdapter(getDummyTrending()) { item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("ITEM", item)
            startActivity(intent)
        }
    }

    // ================= FAVORITE PAGE =================
    private fun setupFavoriteButton() {
        btnFavoritePage.setOnClickListener {
            startActivity(Intent(this, FavoriteActivity::class.java))
        }
    }

    // ================= DUMMY DATA =================
    private fun getDummyCategory(): List<Category> {
        return listOf(
            Category("Makanan", R.drawable.makanan),
            Category("Minuman", R.drawable.minuman),
            Category("Pakaian", R.drawable.pakaian),
            Category("Aksesoris", R.drawable.kerajinan)
        )
    }

    private fun getDummyTrending(): List<TrendingItem> {
        return listOf(
            TrendingItem(
                id = "rendang_001",
                name = "Rendang",
                price = "Rp 15.000",
                image = R.drawable.rrendang,
                category = "Makanan",
                description = "Rendang khas Padang yang dimasak perlahan dengan rempah-rempah pilihan, menghasilkan cita rasa gurih, pedas, dan kaya bumbu yang meresap hingga ke dalam daging.",
                storeId = 1
            ),
            TrendingItem(
                id = "pajangan_dinding_001",
                name = "Pajangan Dinding",
                price = "Rp 35.000",
                image = R.drawable.pajangan,
                category = "Aksesoris",
                description = "Pajangan dinding handmade dengan sentuhan seni unik, cocok untuk mempercantik ruangan dan memberi kesan estetik pada rumah Anda.",
                storeId = 1
            ),
            TrendingItem(
                id = "nagasari_001",
                name = "Nagasari",
                price = "Rp 2.000",
                image = R.drawable.nagasari,
                category = "Makanan",
                description = "Jajanan tradisional berbahan dasar pisang dan santan yang dibungkus daun pisang, memiliki rasa manis dan tekstur lembut.",
                storeId = 1
            ),
            TrendingItem(
                id = "belt_rajut_001",
                name = "Belt Rajut",
                price = "Rp 50.000",
                image = R.drawable.ikatpinggang,
                category = "Aksesoris",
                description = "Ikat pinggang rajut handmade dengan bahan berkualitas tinggi, kuat, nyaman dipakai, dan cocok untuk berbagai gaya fashion.",
                storeId = 2
            ),
            TrendingItem(
                id = "rawon_001",
                name = "Rawon",
                price = "Rp 14.000",
                image = R.drawable.rrawon,
                category = "Makanan",
                description = "Rawon khas Jawa Timur dengan kuah hitam dari kluwek, bercita rasa gurih dan kaya rempah, disajikan dengan daging empuk.",
                storeId = 1
            ),
            TrendingItem(
                id = "wedang_ronde_001",
                name = "Wedang Ronde",
                price = "Rp 10.000",
                image = R.drawable.wedangronde,
                category = "Minuman",
                description = "Minuman jahe hangat dengan isian ronde kenyal dan kacang, cocok dinikmati saat cuaca dingin untuk menghangatkan tubuh.",
                storeId = 1
            ),
            TrendingItem(
                id = "kemeja_rajut_001",
                name = "Kemeja Rajut",
                price = "Rp 130.000",
                image = R.drawable.kemejarajut,
                category = "Pakaian",
                description = "Kemeja rajut premium dengan desain modern, nyaman dipakai, dan cocok digunakan untuk acara santai maupun semi formal.",
                storeId = 2
            ),
            TrendingItem(
                id = "kunyit_asem_001",
                name = "Kunyit Asem",
                price = "Rp 13.000",
                image = R.drawable.kunyitasem,
                category = "Minuman",
                description = "Minuman herbal tradisional berbahan kunyit dan asam jawa yang menyegarkan serta dikenal baik untuk kesehatan tubuh.",
                storeId = 1
            ),
            TrendingItem(
                id = "ayam_betutu_001",
                name = "Ayam Betutu",
                price = "Rp 86.000",
                image = R.drawable.ayambetutu,
                category = "Makanan",
                description = "Ayam Betutu khas Bali dengan bumbu rempah yang meresap dan aroma khas.",
                storeId = 1
            ),
            TrendingItem(
                id = "kerak_telor_001",
                name = "Kerak Telor",
                price = "Rp 25.000",
                image = R.drawable.keraktelor,
                category = "Makanan",
                description = "Makanan khas Betawi berbahan ketan, telur, dan kelapa sangrai.",
                storeId = 1
            ),
            TrendingItem(
                id = "asbak_kayu_001",
                name = "Asbak",
                price = "Rp 65.000",
                image = R.drawable.asbakkayu,
                category = "Aksesoris",
                description = "Asbak kayu dengan tampilan natural, kuat, dan cocok digunakan di dalam maupun luar ruangan.",
                storeId = 2
            ),
            TrendingItem(
                id = "dompet_kulit_001",
                name = "Dompet Kulit",
                price = "Rp 95.000",
                image = R.drawable.dompetkulit,
                category = "Aksesoris",
                description = "Dompet kulit berkualitas dengan desain elegan, dilengkapi banyak slot kartu dan ruang penyimpanan uang.",
                storeId = 2
            ),
            TrendingItem(
                id = "gantungan_kunci_001",
                name = "Gantungan Kunci",
                price = "Rp 15.000",
                image = R.drawable.gantungankunci,
                category = "Aksesoris",
                description = "Gantungan kunci unik dan ringan, cocok sebagai aksesoris tas atau kunci kendaraan.",
                storeId = 2
            ),
            TrendingItem(
                id = "mie_aceh_001",
                name = "Mie Aceh",
                price = "Rp 20.000",
                image = R.drawable.miaceh,
                category = "Makanan",
                description = "Mie khas Aceh dengan bumbu kari yang kaya rasa.",
                storeId = 1
            ),
            TrendingItem(
                id = "papeda_001",
                name = "Papeda",
                price = "Rp 15.000",
                image = R.drawable.ppapeda,
                category = "Makanan",
                description = "Makanan khas Papua berbahan dasar sagu dengan tekstur kenyal.",
                storeId = 1
            ),
            TrendingItem(
                id = "pempek_001",
                name = "Pempek",
                price = "Rp 10.000",
                image = R.drawable.ppempek,
                category = "Makanan",
                description = "Pempek khas Palembang disajikan dengan kuah cuko.",
                storeId = 1
            )
        )
    }
}

