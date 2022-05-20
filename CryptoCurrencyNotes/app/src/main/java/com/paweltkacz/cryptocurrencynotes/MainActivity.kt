package com.paweltkacz.cryptocurrencynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var i : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addNewButton : ImageButton = findViewById(R.id.addNewButton)
        addNewButton.setOnClickListener{
            addNewButtonToScrollMenu()
        }
    }

    fun addNewButtonToScrollMenu(){
        val maxButtonsNumber : Int = 5
        val linearLayout1 = findViewById(R.id.LinearLayout1) as LinearLayout
        val imageButton = ImageButton(this)
        if(i > maxButtonsNumber){
            Toast.makeText(this, "You can't add more buttons, please upgrade account to premium", Toast.LENGTH_SHORT).show()
        }else{
            imageButton.setImageResource(R.drawable.addednewbutton)
            linearLayout1.addView(imageButton)
            Toast.makeText(this,"New Button Added", Toast.LENGTH_SHORT).show()
            i++
        }
    }
}