package com.example.vpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class adapterScreenVP(contextActivity:FragmentActivity): FragmentStateAdapter(contextActivity){

    override fun getItemCount()=4

    override fun createFragment(position: Int): Fragment {
        when(position){

            0-> {
                val fragInicio=Inicio()
                return fragInicio
            }

            1->{
                val fragLst=Lista()
                return fragLst
            }

            2->{
                val fragSponsor=Creditos()
                return fragSponsor
            }

            3->{
                val fragRegistrar=Registrar()
                return fragRegistrar
            }

        }

        return Fragment()
    }
}