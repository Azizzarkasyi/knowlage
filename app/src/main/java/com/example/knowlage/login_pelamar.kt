package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class login_pelamar : AppCompatActivity() {
    private lateinit var btn :Button
    private lateinit var btn2 :TextView
    private lateinit var email :EditText
    private lateinit var katasandi :EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_pelamar)
        btn =findViewById(R.id.buttonlogin)
        btn2 =findViewById(R.id.to_sign)
        email =findViewById(R.id.editTextTextlogin_pelamar)
        katasandi =findViewById(R.id.editTextTextPasswordlogin_pelamar)

        btn.setOnClickListener {
            val  etemail = email.text.toString().trim()
            val  etkatasandi = katasandi.text.toString().trim()
            if (etemail.isEmpty()|| etkatasandi.isEmpty()){
                Toast.makeText(this,"tidak boleh kosong",Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }else{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            }
        }
        btn2.setOnClickListener {
            val intent = Intent(this,daftar_akun_Pelamar::class.java)
            startActivity(intent)
        }


    }
}