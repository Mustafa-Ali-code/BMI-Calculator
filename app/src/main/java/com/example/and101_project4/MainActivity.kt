package com.example.and101_project4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextWeight = findViewById<EditText>(R.id.weight)
        val editTextHeight = findViewById<EditText>(R.id.height)
        val button = findViewById<Button>(R.id.calculate)
        val textView = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            val height = editTextHeight.text.toString().toFloat() / 100
            val weight = editTextWeight.text.toString().toFloat()
            val bmi = weight / (height * height)
            textView.text = bmi.toString()
        }



    }

}