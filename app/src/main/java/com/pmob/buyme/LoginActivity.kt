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
        val txtForgot = findViewById<TextView>(R.id.txtForgot)
        val txtRegister = findViewById<TextView>(R.id.txtRegister)

        val pref = getSharedPreferences("LOGIN", MODE_PRIVATE)

        txtForgot.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        txtForgot.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordEmailActivity::class.java))
        }

        txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }



        btnLogin.setOnClickListener {
            val phone = edtPhone.text.toString()
            val password = edtPassword.text.toString()

            if (phone.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Data belum lengkap", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            pref.edit().putBoolean("IS_LOGIN", true).apply()

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
