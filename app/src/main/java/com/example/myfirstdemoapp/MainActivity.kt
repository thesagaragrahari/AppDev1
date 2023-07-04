package com.example.myfirstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonRead= findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.LinearLayout)

        buttonDark.setOnClickListener {
            //toasting information
            Toast.makeText(applicationContext, "Oops...night! dark mode is on",Toast.LENGTH_LONG).show()
            layout.setBackgroundResource(R.color.black)
        }
        buttonRead.setOnClickListener {
            //toasting information
            Toast.makeText(applicationContext, "Wow! seems you are ready to read now",Toast.LENGTH_LONG).show()
            layout.setBackgroundResource(R.color.readingyellow)

        }
    }
}