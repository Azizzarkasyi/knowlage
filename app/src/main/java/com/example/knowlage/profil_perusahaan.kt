package com.example.knowlage

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class profil_perusahaan : Fragment() {
    private lateinit var imageButton: ImageButton
    private lateinit var relativeLayout: RelativeLayout
    private lateinit var imageButton2: ImageButton
    private lateinit var relativeLayout2: RelativeLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val next= inflater.inflate(R.layout.fragment_profil_perusahaan, container, false)
        imageButton =next.findViewById(R.id.imageButton3d)
        relativeLayout =next.findViewById(R.id.kata_sandi_profild)
        imageButton2 =next.findViewById(R.id.imageButton4d)
        relativeLayout2 =next.findViewById(R.id.keluard)


        relativeLayout.setOnClickListener {
            val intent = Intent(activity,Kata_Sandi::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent = Intent(activity,Kata_Sandi::class.java)
            startActivity(intent)
        }


        imageButton2.setOnClickListener {
            val message :String? ="Yakin Ingin Keluar?"
            showCustomDialog(message)
        }
        relativeLayout2.setOnClickListener {
            val message :String? ="Yakin Ingin Keluar?"
            showCustomDialog(message)
        }
        return next
    }
    private fun showCustomDialog(message: String?) {
        val dialog = Dialog(activity as AppCompatActivity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_alert)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val view : TextView = dialog.findViewById(R.id.textView38)
        val btyes : TextView = dialog.findViewById(R.id.button3)
        val btno : TextView = dialog.findViewById(R.id.button2)
        view.text=(message)
        btyes.setOnClickListener{
            val intent = Intent(activity,halaman_pilih::class.java)
            startActivity(intent)
        }
        btno.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }
}