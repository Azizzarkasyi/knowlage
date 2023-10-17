package com.example.knowlage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class documentadapter ( private val documentList:List<dokument>)
    : RecyclerView.Adapter<documentadapter.documentViewHolder>(){



    class documentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.textView39)
        val textView1 : TextView = itemView.findViewById(R.id.textView40)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): documentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dokument , parent,false)
        return documentViewHolder(view)
    }

    override fun onBindViewHolder(holder: documentViewHolder, position: Int) {
        val pekerja = documentList[position]
        holder.textView.text = pekerja.jenis
        holder.textView1.text = pekerja.sudah
    }

    override fun getItemCount(): Int {

        return documentList.size
    }

}
