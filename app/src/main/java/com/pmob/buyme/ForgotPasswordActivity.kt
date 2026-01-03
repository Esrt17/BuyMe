package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val edtContact = findViewById<EditText>(R.id.edtContact)
        val btnSend = findViewById<Button>(R.id.btnSend)

        btnSend.setOnClickListener {
            val contact = edtContact.text.toString()

            if (contact.isEmpty()) {
                Toast.makeText(this, "Kontak kosong", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val code = generateCode()

            val intent = Intent(this, VerifyCodeActivity::class.java)
            intent.putExtra("CODE", code)
            startActivity(intent)

            Toast.makeText(this, "Kode verifikasi: $code", Toast.LENGTH_SHORT).show()
        }
    }

    private fun generateCode(): String {
        return (1000..9999).random().toString()
    }
}
