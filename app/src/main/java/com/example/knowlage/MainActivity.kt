package com.example.knowlage

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.knowlage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(home())

        binding.navbar.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home ->replaceFragment(home())
                R.id.pesan ->replaceFragment(pesan())
                R.id.notifikasi->replaceFragment(notifikasi())
                R.id.saved ->replaceFragment(saved())
                R.id.profil ->replaceFragment(profil())

                else->{

                }
            }
            true

        }


    }



    private fun replaceFragment(fragment: Fragment){
        val fragmentManajer = supportFragmentManager
        val fragmentTransaction = fragmentManajer.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}