package com.example.learnit

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class phrases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        val phrasesList = ArrayList<word>()
        phrasesList.add(word("Hi", "Salute"))
        phrasesList.add(word("Bye", "Au Revoir"))
        phrasesList.add(word("See You Again", "a la prochaine"))
        phrasesList.add(word("Good Morning", "Bonjour"))
        phrasesList.add(word("Good Night", "Bonne nuit"))
        phrasesList.add(word("I love you", "je t'aime"))
        val phrasesAdapter = wordAdapter(this, phrasesList, R.color.category_phrases_light)
        val phrases_listview = findViewById<ListView>(R.id.item_listview)
        phrases_listview.adapter = phrasesAdapter
    }
}