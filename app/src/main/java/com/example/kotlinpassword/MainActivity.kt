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
            var PassLen = number.text.toString().toInt()
            if (PassLen<=0 || PassLen >27){
                Toast.makeText(this,"Invalid value, please insert valid length.",Toast.LENGTH_SHORT).show()
            }
            else {
                field.text = GeneratePassword(PassLen)
            }
        }
    }
}

fun GeneratePassword(length :Int):String{
    var char = ('a'..'z') + ('A'..'Z' ) + (0 .. 9)
    return List(length) {char.random()}.joinToString(" ")
}
