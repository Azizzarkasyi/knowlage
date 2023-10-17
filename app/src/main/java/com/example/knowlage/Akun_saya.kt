package com.example.knowlage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Akun_saya : AppCompatActivity() {
    private lateinit var imageButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun_saya)
        imageButton = findViewById(R.id.imageButton7)
        imageButton.setOnClickListener {
            onBackPressed()
        }

    }
}