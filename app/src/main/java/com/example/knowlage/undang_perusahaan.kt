package com.example.knowlage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class undang_perusahaan : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val new =inflater.inflate(R.layout.fragment_undang_perusahaan, container, false)
        val btn :Button = new.findViewById(R.id.button10)
        val btn2 :Button = new.findViewById(R.id.button10r)
        val btn3 :Button = new.findViewById(R.id.button10v)


        btn.setOnClickListener {
            val pesanfragment = pesan_perusahaan()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout1,pesanfragment)?.commit()
        }
        btn2.setOnClickListener {
            val pesanfragment = pesan_perusahaan()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout1,pesanfragment)?.commit()
        }
        btn3.setOnClickListener {
            val pesanfragment = pesan_perusahaan()
            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout1,pesanfragment)?.commit()
        }
        return new
    }

}