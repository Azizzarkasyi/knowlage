package com.example.knowlage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class home : Fragment() {
    private lateinit var pekerjaanList :ArrayList<pekerjaan>
    private lateinit var pekerjaanadapter: pekerjaanadapter
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
       val next =inflater.inflate(R.layout.fragment_home, container, false)
        val btn :ImageButton = next.findViewById(R.id.imageButtonsearch)
        val btn2 :ImageButton = next.findViewById(R.id.imageButtonmenu)
        val recyclerView :RecyclerView = next.findViewById(R.id.recycleView_home)

        btn.setOnClickListener{
            val intent = Intent(activity,pencarian::class.java)
            startActivity(intent)
        }


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
            val  intent = Intent(activity,Detail_pekerjaan::class.java)
            intent.putExtra("pekerja",it)
            startActivity(intent)
        }
        return next
    }


}