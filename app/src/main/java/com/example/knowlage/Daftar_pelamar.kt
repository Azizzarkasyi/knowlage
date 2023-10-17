package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Daftar_pelamar : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var pelamarList :ArrayList<pelamar>
    private lateinit var pelamaradapter: pelamaradapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_pelamar)
        recyclerView =findViewById(R.id.recycleView33)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        pelamarList = ArrayList()

        pelamarList.add(pelamar(R.drawable.nova,"Novi Hartini, S.Tr., S.Kom.", "Riwayat Pekerjaan : PT. Sinarmas Tbk","Pengalaman Kerja : Staf Manager","E-Mail : novan0189@gmail.com","No. Telp : 082277459023","Pengalaman Kerja : 4 Tahun"))
        pelamarList.add(pelamar(R.drawable.pangeran,"Novi Hartini, S.Tr., S.Kom.", "Riwayat Pekerjaan : PT. Sinarmas Tbk","Pengalaman Kerja : Staf Manager","E-Mail : novan0189@gmail.com","No. Telp : 082277459023","Pengalaman Kerja : 4 Tahun"))
        pelamarList.add(pelamar(R.drawable.adel,"Novi Hartini, S.Tr., S.Kom.", "Riwayat Pekerjaan : PT. Sinarmas Tbk","Pengalaman Kerja : Staf Manager","E-Mail : novan0189@gmail.com","No. Telp : 082277459023","Pengalaman Kerja : 4 Tahun"))
        pelamarList.add(pelamar(R.drawable.fauzan,"Novi Hartini, S.Tr., S.Kom.", "Riwayat Pekerjaan : PT. Sinarmas Tbk","Pengalaman Kerja : Staf Manager","E-Mail : novan0189@gmail.com","No. Telp : 082277459023","Pengalaman Kerja : 4 Tahun"))
        pelamarList.add(pelamar(R.drawable.aziz,"Novi Hartini, S.Tr., S.Kom.", "Riwayat Pekerjaan : PT. Sinarmas Tbk","Pengalaman Kerja : Staf Manager","E-Mail : novan0189@gmail.com","No. Telp : 082277459023","Pengalaman Kerja : 4 Tahun"))


        pelamaradapter = pelamaradapter(pelamarList)
        recyclerView.adapter = pelamaradapter

        pelamaradapter.onClik ={
            val  intent = Intent(this,Detail_pelamar::class.java)
            intent.putExtra("pelamar",it)
            startActivity(intent)
        }
    }
}