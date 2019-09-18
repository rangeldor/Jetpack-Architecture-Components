package com.example.databinding

import android.content.Context
import android.widget.Toast

class EventHandler(context: Context) {

    private val myContext: Context = context

    fun onButtonClick(){
        Toast.makeText(myContext, "Hello", Toast.LENGTH_SHORT).show()
    }
}