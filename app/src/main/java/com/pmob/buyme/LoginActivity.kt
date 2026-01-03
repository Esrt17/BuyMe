package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtPhone = findViewById<EditText>(R.id.edtPhone)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val txtRegister = findViewById<TextView>(R.id.txtRegister)

        val pref = getSharedPreferences("LOGIN", MODE_PRIVATE)
        if (pref.getBoolean("IS_LOGIN", false)) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // Pindah ke halaman Register
        txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        btnLogin.setOnClickListener {
            val phone = edtPhone.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            if (phone.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Nomor HP dan Password wajib diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Login langsung (tanpa validasi backend)
            pref.edit()
                .putBoolean("IS_LOGIN", true)
                .apply()

            Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
