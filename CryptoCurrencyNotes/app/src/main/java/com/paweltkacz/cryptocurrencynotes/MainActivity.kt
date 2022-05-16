package com.paweltkacz.cryptocurrencynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addNewButton : ImageButton = findViewById(R.id.addNewButton)
        addNewButton.setOnClickListener{
            Toast.makeText(this,"New Button Added", Toast.LENGTH_LONG).show()
            addNewButtonToScrollMenu()
        }
    }

    fun addNewButtonToScrollMenu(){
        val linearLayout1 = findViewById(R.id.LinearLayout1) as LinearLayout
        val imageButton = ImageButton(this)
        imageButton.setImageResource(R.drawable.addednewbutton)
        linearLayout1.addView(imageButton)
    }
}