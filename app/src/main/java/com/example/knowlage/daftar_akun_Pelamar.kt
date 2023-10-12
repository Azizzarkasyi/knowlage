package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class daftar_akun_Pelamar : AppCompatActivity() {
    private lateinit var btn :Button
    private lateinit var nama :EditText
    private lateinit var email :EditText
    private lateinit var No_telp :EditText
    private lateinit var katasandi :EditText
    private lateinit var confsandi :EditText
    private lateinit var checbox :CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_akun_pelamar)
        nama = findViewById(R.id.editTextText_nama_lengkap)
        email = findViewById(R.id.editTextText_email)
        No_telp = findViewById(R.id.editTextText_nomor_telepon)
        katasandi = findViewById(R.id.editTextText_kata_sandi)
        confsandi = findViewById(R.id.editTextText_konfirm_sandi)
        checbox = findViewById(R.id.persetujuan)
        btn = findViewById(R.id.button_daftar_pelamar)

        btn.setOnClickListener {
            val etnama = nama.text.toString().trim()
            val etemail = email.text.toString().trim()
            val etNo_telp = No_telp.text.toString().trim()
            val etkatasandi = katasandi.text.toString().trim()
            val etconfsandi = confsandi.text.toString().trim()

            if (etnama.isEmpty() ||etemail.isEmpty() ||etNo_telp.isEmpty() ||etkatasandi.isEmpty() ||etconfsandi.isEmpty()){
                Toast.makeText(this,"lengkapi data",Toast.LENGTH_SHORT).show()
            }else if (etkatasandi!=etconfsandi){
                Toast.makeText(this,"kata sandi tidak sama",Toast.LENGTH_SHORT).show()

            }else  if (checbox.isChecked == false){
                checbox.error = "centang"
                Toast.makeText(this,"Centang untuk melanjutkan",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,login_pelamar::class.java)
                startActivity(intent)
            }
        }
    }
}