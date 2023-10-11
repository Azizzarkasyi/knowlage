package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RelativeLayout

class pencarian : AppCompatActivity() {
    private lateinit var btn : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pencarian)
        btn = findViewById(R.id.imageButton13)

        btn.setOnClickListener(){
            val intent = Intent(this,viewpekerja::class.java)
            startActivity(intent)
        }
    }
}