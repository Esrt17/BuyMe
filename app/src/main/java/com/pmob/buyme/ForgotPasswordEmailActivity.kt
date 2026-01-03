package com.pmob.buyme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordEmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password_email)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val email = edtEmail.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email belum diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            startActivity(
                Intent(this, ForgotPasswordCodeActivity::class.java)
                    .putExtra("EMAIL", email)
            )
        }
    }
}
