package com.example.knowlage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Kata_Sandi : AppCompatActivity() {
    private lateinit var imageButton:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kata_sandi)
        imageButton =findViewById(R.id.imageButton16)

        imageButton.setOnClickListener {
            onBackPressed()
        }
    }
}