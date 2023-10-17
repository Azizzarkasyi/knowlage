package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class buat_lamaran : AppCompatActivity() {
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_lamaran)
        btn = findViewById(R.id.button15)
        btn.setOnClickListener {
            val intent = Intent(this,Berhasil_diposting::class.java)
            startActivity(intent)
        }
    }
}