package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class login_pelamar : AppCompatActivity() {
    private lateinit var btn :Button
    private lateinit var btn2 :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_pelamar)
        btn =findViewById(R.id.buttonlogin)
        btn2 =findViewById(R.id.to_sign)

        btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this,daftar_akun_Pelamar::class.java)
            startActivity(intent)
        }

    }
}