package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class succes : AppCompatActivity() {
    private lateinit var relativeLayout: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succes)
        relativeLayout = findViewById(R.id.succes)


        relativeLayout.setOnClickListener{
            val intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}