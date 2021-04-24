package com.example.learnit

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class numbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        val numbersList = ArrayList<word>()
        numbersList.add(word("One", "Un", R.drawable.number_one, R.raw.number_one))
        numbersList.add(word("Two", "Deux", R.drawable.number_two, R.raw.number_two))
        numbersList.add(word("Three", "Trois", R.drawable.number_three, R.raw.number_three))
        numbersList.add(word("Four", "Quatre", R.drawable.number_four, R.raw.number_four))
        numbersList.add(word("Five", "Cinq", R.drawable.number_five, R.raw.number_five))
        numbersList.add(word("Six", "Six", R.drawable.number_six, R.raw.number_six))
        numbersList.add(word("Seven", "Sept", R.drawable.number_seven, R.raw.number_seven))
        numbersList.add(word("Eight", "Huit", R.drawable.number_eight, R.raw.number_eight))
        numbersList.add(word("Nine", "Nuef", R.drawable.number_nine, R.raw.number_nine))
        val numbersAdapter = wordAdapter(this, numbersList, R.color.category_numbers_light)
        val numbers_listview = findViewById<ListView>(R.id.item_listview)
        numbers_listview.adapter = numbersAdapter
        numbers_listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val position = numbersList[i]
            val mediaPlayer = MediaPlayer.create(this@numbers, position.audioResourceId)
            mediaPlayer.start()
        }
    }
}