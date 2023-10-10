package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class halaman_pilih : AppCompatActivity() {
    private lateinit var btn:Button
    private lateinit var btn2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_pilih)
        btn = findViewById(R.id.button_pelamar)
        btn2 = findViewById(R.id.button_perusahaan)


        btn.setOnClickListener{
            val intent = Intent(this,login_pelamar::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent =Intent(this,login_perusahaan::class.java)
            startActivity(intent)
        }
    }
}