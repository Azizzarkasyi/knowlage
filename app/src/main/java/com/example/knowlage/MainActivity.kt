package com.example.knowlage

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.knowlage.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(home())
        drawerLayout = findViewById(R.id.drawer_layout)


        navigationView = findViewById(R.id.sidebar)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.clise)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

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