package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Detail_pekerjaan : AppCompatActivity() {
    private lateinit var tv1 :TextView
    private lateinit var tv2 :TextView
    private lateinit var tv3 :TextView
    private lateinit var btnback :ImageButton
    private lateinit var btn :Button
    private lateinit var pekerjaanadapter: pekerjaanadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pekerjaan)
        tv1 =findViewById(R.id.textViewpekerjaan)
        tv2 =findViewById(R.id.textViewPT)
        tv3 =findViewById(R.id.textViewtempat)
        btn = findViewById(R.id.button)
        btnback =findViewById(R.id.imageButtonback)


        val pekerja = intent.getParcelableExtra<pekerjaan>("pekerja")
        if (pekerja!= null){
            tv1.text = pekerja.pekerjaaan
            tv2.text = pekerja.PT
            tv3.text = pekerja.tempat
        }
        btnback.setOnClickListener{
            onBackPressed()
        }
        btn.setOnClickListener{
                val  intent = Intent(this,Apply_lamaran::class.java)
                startActivity(intent)

        }
    }
}