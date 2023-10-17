package com.example.knowlage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class home_perusahaan : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  new =inflater.inflate(R.layout.fragment_home_perusahaan, container, false)
        val btn : Button = new.findViewById(R.id.button11)
        val btn1 : Button = new.findViewById(R.id.button12)
        val btn2 : Button = new.findViewById(R.id.button13)
        val btn3 : Button = new.findViewById(R.id.button14)
        btn.setOnClickListener {
            val  intent = Intent(activity,buat_lamaran::class.java)
            startActivity(intent)
        }
        btn1.setOnClickListener {
            val intent = Intent(activity,Daftar_pelamar::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(activity,Daftar_pelamar::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(activity,Daftar_pelamar::class.java)
            startActivity(intent)
        }


        return new
    }
}