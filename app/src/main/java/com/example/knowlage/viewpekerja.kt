package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class viewpekerja : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var pekerjaanList :ArrayList<pekerjaan>
    private lateinit var pekerjaanadapter: pekerjaanadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpekerja)
        recyclerView =findViewById(R.id.recycleView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        pekerjaanList = ArrayList()

        pekerjaanList.add(pekerjaan(R.drawable.logo,"UI UX Desainer", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"Data Analyst", "PT. Dyandra Promosindo","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"Developer Enginer", "PT. Royale","Bandung, Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"Account Manager", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"Web Development", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"Developer Enginer", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"UI UX Desainer", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"UI UX Desainer", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"UI UX Desainer", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"UI UX Desainer", "PT.Royal Trust","Jakarta,Indonesia"))
        pekerjaanList.add(pekerjaan(R.drawable.logo,"UI UX Desainer", "PT.Royal Trust","Jakarta,Indonesia"))


        pekerjaanadapter = pekerjaanadapter(pekerjaanList)
        recyclerView.adapter = pekerjaanadapter

        pekerjaanadapter.onClik ={
            val  intent = Intent(this,Detail_pekerjaan::class.java)
            intent.putExtra("pekerja",it)
            startActivity(intent)
        }



    }
}