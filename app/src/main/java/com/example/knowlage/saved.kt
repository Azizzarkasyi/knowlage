package com.example.knowlage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [saved.newInstance] factory method to
 * create an instance of this fragment.
 */
class saved : Fragment() {
    private lateinit var pekerjaanList :ArrayList<pekerjaan>
    private lateinit var pekerjaanadapter: pekerjaanadapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val next = inflater.inflate(R.layout.fragment_saved, container, false)
        val recyclerView2 : RecyclerView = next.findViewById(R.id.recycleView_saved)
        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = LinearLayoutManager(activity)

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
        recyclerView2.adapter = pekerjaanadapter

        pekerjaanadapter.onClik ={
            val  intent = Intent(activity,Detail_pekerjaan::class.java)
            intent.putExtra("pekerja",it)
            startActivity(intent)
        }
        return next
    }

}