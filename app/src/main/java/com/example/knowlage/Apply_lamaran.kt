package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Apply_lamaran : AppCompatActivity() {
    private lateinit var tv1 : TextView
    private lateinit var tv2 : TextView
    private lateinit var tv3 : TextView
    private lateinit var btn : Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var documentList :ArrayList<dokument>
    private lateinit var documentadapter: documentadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply_lamaran)
        tv1 = findViewById(R.id.textViewlamaranpekerjaan)
        tv2 = findViewById(R.id.textViewlamaranPT)
        tv3 = findViewById(R.id.textViewlamarantempat)
        recyclerView = findViewById(R.id.recycleView32)
        btn = findViewById(R.id.button7)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val pekerja = intent.getParcelableExtra<pekerjaan>("pekerja")
        if (pekerja!= null){
            tv1.text = pekerja.pekerjaaan
            tv2.text = pekerja.PT
            tv3.text = pekerja.tempat
        }

        documentList = ArrayList()

        documentList.add(dokument("Curriculum Vitae (CV)", "Sudah Diupload",))
        documentList.add(dokument("Pas Foto", "Belum Diupload"))
        documentList.add(dokument("Transkrip Nilai", "Belum Diupload"))
        documentList.add(dokument("Ijazah Pendidikan", "Belum Diupload"))
        documentList.add(dokument("Dokumen lainnya (PDF)", "Sudah Diupload"))



        documentadapter = documentadapter(documentList)
        recyclerView.adapter = documentadapter
        btn.setOnClickListener {
            val  intent = Intent(this,succes::class.java)
            startActivity(intent)
        }
    }
}