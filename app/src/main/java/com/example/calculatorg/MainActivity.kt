package com.example.calculatorg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        btnAdd.setOnClickListener {
            val firstnum = findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
            val secondnum = findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()
            val result = firstnum + secondnum
            tvResult.text = result.toString()

        }
    }
}
