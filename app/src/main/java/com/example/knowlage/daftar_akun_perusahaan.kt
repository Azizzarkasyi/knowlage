package com.example.knowlage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class daftar_akun_perusahaan : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var email : EditText
    private lateinit var No_telp : EditText
    private lateinit var katasandi : EditText
    private lateinit var confsandi : EditText
    private lateinit var checbox : CheckBox
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_akun_perusahaan)
        nama = findViewById(R.id.editTextText_nama_lengkap_peusahaan)
        email = findViewById(R.id.editTextText_email_perusahaan)
        No_telp = findViewById(R.id.editTextText_nomor_telepon_perusahaan)
        katasandi = findViewById(R.id.editTextText_kata_sandi_perusahaan)
        confsandi = findViewById(R.id.editTextText_konfirm_sandi_perusahaan)
        checbox = findViewById(R.id.persetujuan_perusahaan)
        btn = findViewById(R.id.button_daftar_perusahaan)
        btn.setOnClickListener {
            val etnama = nama.text.toString().trim()
            val etemail = email.text.toString().trim()
            val etNo_telp = No_telp.text.toString().trim()
            val etkatasandi = katasandi.text.toString().trim()
            val etconfsandi = confsandi.text.toString().trim()

            if (etnama.isEmpty() ||etemail.isEmpty() ||etNo_telp.isEmpty() ||etkatasandi.isEmpty() ||etconfsandi.isEmpty()){
                Toast.makeText(this,"lengkapi data", Toast.LENGTH_SHORT).show()
            }else if (etkatasandi!=etconfsandi){
                Toast.makeText(this,"kata sandi tidak sama", Toast.LENGTH_SHORT).show()

            }else  if (checbox.isChecked == false){
                checbox.error = "centang"
                Toast.makeText(this,"Centang untuk melanjutkan", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,login_perusahaan::class.java)
                startActivity(intent)
            }
        }
    }
}