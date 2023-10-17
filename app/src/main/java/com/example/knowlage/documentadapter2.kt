package com.example.knowlage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class documentadapter2 (private val document2List:List<document2>): RecyclerView.Adapter<documentadapter2.document2ViewHolder>(){
    class document2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView : TextView = itemView.findViewById(R.id.textView68)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): document2ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.document2 , parent,false)
        return document2ViewHolder(view)
    }

    override fun onBindViewHolder(holder: document2ViewHolder, position: Int) {
        val pelm = document2List[position]
        holder.textView.text=pelm.jenis
    }

    override fun getItemCount(): Int {
        return document2List.size
    }
}