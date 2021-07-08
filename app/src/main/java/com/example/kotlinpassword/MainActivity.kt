package com.example.kotlinpassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = findViewById<EditText>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            //TODO Implement the algorithm

        }
    }
}