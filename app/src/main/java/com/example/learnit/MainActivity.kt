package com.example.learnit

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colors = findViewById<TextView>(R.id.colors)
        colors.setOnClickListener {
            val colorsIntent = Intent(this@MainActivity, com.example.learnit.colors::class.java)
            startActivity(colorsIntent)
        }
        val family = findViewById<TextView>(R.id.family)
        family.setOnClickListener {
            val familyIntent = Intent(this@MainActivity, com.example.learnit.family::class.java)
            startActivity(familyIntent)
        }
        val numbers = findViewById<TextView>(R.id.numbers)
        numbers.setOnClickListener {
            val numbersIntent = Intent(this@MainActivity, com.example.learnit.numbers::class.java)
            startActivity(numbersIntent)
        }
        val phrases = findViewById<TextView>(R.id.phrases)
        phrases.setOnClickListener {
            val phrasesIntent = Intent(this@MainActivity, com.example.learnit.phrases::class.java)
            startActivity(phrasesIntent)
        }
    }
}