package com.pmob.buyme

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val edtNewPassword = findViewById<EditText>(R.id.edtNewPassword)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val newPass = edtNewPassword.text.toString()

            if (newPass.isEmpty()) {
                Toast.makeText(this, "Password kosong", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Password berhasil diubah", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
