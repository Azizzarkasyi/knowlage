package com.example.knowlage

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class pekerjaanadapter( private val pekerjaanList:List<pekerjaan>)
    : RecyclerView.Adapter<pekerjaanadapter.pekejaanViewHolder>(){



    class pekejaanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageViewlogosearh)
        val textView : TextView = itemView.findViewById(R.id.pekerjaansearch)
        val textView1 : TextView = itemView.findViewById(R.id.ptperusahaansearch)
        val textView2 : TextView = itemView.findViewById(R.id.tempatpekerjaansearch)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pekejaanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search , parent,false)
        return pekejaanViewHolder(view)
    }



    override fun onBindViewHolder(holder: pekejaanViewHolder, position: Int) {
        val pekerja = pekerjaanList[position]
        holder.imageView.setImageResource(pekerja.image)
        holder.textView.text = pekerja.pekerjaaan
        holder.textView1.text = pekerja.PT
        holder.textView2.text = pekerja.tempat
    }

    override fun getItemCount(): Int {

        return pekerjaanList.size
    }

}