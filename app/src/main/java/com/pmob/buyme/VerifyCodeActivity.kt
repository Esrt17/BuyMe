package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VerifyCodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_code)

        val edtCode = findViewById<EditText>(R.id.edtCode)
        val btnVerify = findViewById<Button>(R.id.btnVerify)

        val realCode = intent.getStringExtra("CODE")

        btnVerify.setOnClickListener {
            val inputCode = edtCode.text.toString()

            if (inputCode.length == 4 && inputCode.all { it.isDigit() }) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Kode harus 4 digit angka", Toast.LENGTH_SHORT).show()
            }
        }

    }
}

