package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Detail_pelamar : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var document2List :ArrayList<document2>
    private lateinit var documentadapter2: documentadapter2
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private lateinit var btn : Button
    private lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pelamar)
        imageView = findViewById(R.id.imageView3d)
        textView = findViewById(R.id.nama_profild)
        textView2 = findViewById(R.id.email)
        recyclerView = findViewById(R.id.recycleView45)
        btn = findViewById(R.id.button16)
        btn2 = findViewById(R.id.button17)


        val pela = intent.getParcelableExtra<pelamar>("pelamar")
        if (pela!= null){
            imageView.setImageResource(pela.image)
            textView.text = pela.pekerjaan
            textView2.text = pela.email
        }

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        document2List = ArrayList()

        document2List.add(document2("Surat lamaran"))
        document2List.add(document2("Curriculum Vitae (CV)"))
        document2List.add(document2("Transkrip Nilai"))
        document2List.add(document2("Ijazah Pendidikan"))
        document2List.add(document2("Dokumen lainnya (PDF)"))



        documentadapter2 = documentadapter2(document2List)
        recyclerView.adapter = documentadapter2

        btn.setOnClickListener {
            val  intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
        btn2.setOnClickListener {
            val  intent = Intent(this,Daftar_pelamar::class.java)
            startActivity(intent)

        }

    }
}