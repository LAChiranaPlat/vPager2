package com.example.vpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var views:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views= ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)

        val vp=views.vp
        val tabs=views.tabs

        val adapter=adapterScreenVP(this)
        vp.adapter=adapter

        val manager=TabLayoutMediator(tabs,vp,TabLayoutMediator.TabConfigurationStrategy({tabs:TabLayout.Tab,position:Int->

            when(position)
            {
                0->tabs.setIcon(getDrawable(R.drawable.ini))
                1->tabs.setIcon(getDrawable(R.drawable.list))
                2->tabs.setIcon(getDrawable(R.drawable.pub))
                3->tabs.setIcon(getDrawable(R.drawable._new))
            }

        }))

        manager.attach()

    }
}