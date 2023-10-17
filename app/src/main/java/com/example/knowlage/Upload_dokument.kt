package com.example.knowlage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Upload_dokument : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var documentList :ArrayList<dokument>
    private lateinit var documentadapter: documentadapter
    private lateinit var imageButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_dokument)
        recyclerView =findViewById(R.id.recycleView2)
        imageButton =findViewById(R.id.imageButton18)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        documentList = ArrayList()

        documentList.add(dokument("Curriculum Vitae (CV)", "Sudah Diupload",))
        documentList.add(dokument("Pas Foto", "Belum Diupload"))
        documentList.add(dokument("Transkrip Nilai", "Belum Diupload"))
        documentList.add(dokument("Ijazah Pendidikan", "Belum Diupload"))
        documentList.add(dokument("Dokumen lainnya (PDF)", "Sudah Diupload"))



        documentadapter = documentadapter(documentList)
        recyclerView.adapter = documentadapter

        imageButton.setOnClickListener {
            onBackPressed()
        }
    }
}