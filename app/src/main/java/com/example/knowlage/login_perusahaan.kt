package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login_perusahaan : AppCompatActivity() {
    private lateinit var btn : Button
    private lateinit var btn2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_perusahaan)
        btn = findViewById(R.id.buttonlogin_perusahaan)
        btn2 = findViewById(R.id.sign_perusahaan)



        btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this,daftar_akun_perusahaan::class.java)
            startActivity(intent)
        }
    }
}