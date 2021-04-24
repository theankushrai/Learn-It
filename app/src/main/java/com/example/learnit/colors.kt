package com.example.learnit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.media.MediaPlayer
import android.widget.ListView
import java.util.ArrayList

class colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        val colorsList = ArrayList<word>()
        colorsList.add(word("Red", "Rouge", R.drawable.color_red, R.raw.color_red))
        colorsList.add(word("Orange", "Orange", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow))
        colorsList.add(word("Yellow", "Jaune", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow))
        colorsList.add(word("Green", "Vert", R.drawable.color_green, R.raw.color_green))
        colorsList.add(word("Gray", "Grise", R.drawable.color_gray, R.raw.color_green))
        colorsList.add(word("White", "Blanche", R.drawable.color_white, R.raw.color_white))
        colorsList.add(word("Black", "Noir", R.drawable.color_black, R.raw.color_black))
        val colorsAdapter = wordAdapter(this, colorsList, R.color.category_colors_light)
        val colors_listview = findViewById<ListView>(R.id.item_listview)
        colors_listview.adapter = colorsAdapter
        colors_listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val position = colorsList[i]
            val mediaPlayer = MediaPlayer.create(this@colors, position.audioResourceId)
            mediaPlayer.start()
        }
    }
}