package com.example.knowlage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.knowlage.databinding.ActivityMain2Binding
import com.example.knowlage.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    private lateinit var  binding : ActivityMain2Binding
    private lateinit var drawerLayout1: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(home_perusahaan())
        drawerLayout1 = findViewById(R.id.drawer_layout1)


        navigationView = findViewById(R.id.sidebar1)

        toggle = ActionBarDrawerToggle(this, drawerLayout1, R.string.open,R.string.clise)
        drawerLayout1.addDrawerListener(toggle)
        toggle.syncState()

        binding.navbarperusahaan.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home ->replaceFragment(home_perusahaan())
                R.id.pesan ->replaceFragment(pesan_perusahaan())
                R.id.notifikasi->replaceFragment(notifikasi_perusahaan())
                R.id.undang ->replaceFragment(undang_perusahaan())
                R.id.profil ->replaceFragment(profil_perusahaan())

                else->{

                }
            }
            true

        }


    }



    private fun replaceFragment(fragment: Fragment){
        val fragmentManajer = supportFragmentManager
        val fragmentTransaction = fragmentManajer.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout1,fragment)
        fragmentTransaction.commit()
    }

}