package com.example.knowlage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class pelamaradapter( private val pelamarList:List<pelamar>)
    : RecyclerView.Adapter<pelamaradapter.pelamarViewHolder>() {
    var onClik : ((pelamar)->Unit)? = null
    class pelamarViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView12c)
        val textView : TextView = itemView.findViewById(R.id.textView47c)
        val textView1 : TextView = itemView.findViewById(R.id.textView48c)
        val textView2 : TextView = itemView.findViewById(R.id.textView49c)
        val textView3 : TextView = itemView.findViewById(R.id.textView50c)
        val textView4 : TextView = itemView.findViewById(R.id.textView51c)
        val textView5 : TextView = itemView.findViewById(R.id.textView52c)
        val info : Button = itemView.findViewById(R.id.button10c)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pelamarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pelamar , parent,false)
        return pelamarViewHolder(view)
    }

    override fun onBindViewHolder(holder: pelamarViewHolder, position: Int) {
        val pelm = pelamarList[position]
        holder.imageView.setImageResource(pelm.image)
        holder.textView.text = pelm.pekerjaan
        holder.textView1.text = pelm.riPT
        holder.textView2.text = pelm.pengalamankj
        holder.textView3.text = pelm.email
        holder.textView4.text = pelm.notlp
        holder.textView5.text = pelm.pengalamanth
        holder.info.setOnClickListener{
            onClik?.invoke(pelm)

        }
    }

    override fun getItemCount(): Int {
        return pelamarList.size
    }
}