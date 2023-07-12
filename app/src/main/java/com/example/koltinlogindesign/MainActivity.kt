package com.example.koltinlogindesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment())

        var bottomnavigation :(BottomNavigationView) = findViewById(R.id.bottomnavigation)
        bottomnavigation.setOnItemSelectedListener  {
            when(it.itemId)
            {
                R.id.home->{
                    loadFragment(HomeFragment())
                    true
                }
                R.id.music->
                {
                    loadFragment(musicFragment())
                    true
                }
                R.id.playlist->
                {
                    loadFragment(libraryFragment())
                    true
                }
                R.id.profile->
                {
                    loadFragment(ProfileFragment())
                    true
                }

                else -> {
                    true
                }
            }
        }


    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}