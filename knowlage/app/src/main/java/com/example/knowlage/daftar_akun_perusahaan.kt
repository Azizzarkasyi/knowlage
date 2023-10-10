package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class daftar_akun_perusahaan : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_akun_perusahaan)
        btn = findViewById(R.id.button_daftar_perusahaan)
        btn.setOnClickListener {
            val intent = Intent(this,login_perusahaan::class.java)
            startActivity(intent)
        }
    }
}