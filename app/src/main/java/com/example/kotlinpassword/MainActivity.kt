package com.example.kotlinpassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = findViewById<EditText>(R.id.editTextNumber)
        var field = findViewById<TextView>(R.id.textView2)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            //TODO Implement the algorithm
            field.text = "Clicked!"
        }
    }
}

class PasswordGenerator{
    val numberOfCharachters:Int = 0
    fun Generate(numberOfCharachters:Int){
        
    }

}