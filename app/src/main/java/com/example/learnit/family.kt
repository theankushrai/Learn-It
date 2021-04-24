package com.example.learnit

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class family : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        val familyList = ArrayList<word>()
        familyList.add(word("Father", "Pere", R.drawable.family_father, R.raw.family_father))
        familyList.add(word("Mother", "Mere", R.drawable.family_mother, R.raw.family_mother))
        familyList.add(word("Son", "Fils", R.drawable.family_son, R.raw.family_son))
        familyList.add(word("Daughter", "Fille", R.drawable.family_daughter, R.raw.family_daughter))
        familyList.add(word("Brother", "Frere", R.drawable.family_older_brother, R.raw.family_older_brother))
        familyList.add(word("Sister", "Soeur", R.drawable.family_older_sister, R.raw.family_older_sister))
        familyList.add(word("Grandmother", "Grand-mere", R.drawable.family_grandmother, R.raw.family_grandmother))
        familyList.add(word("Grandfather", "Grand-Pere", R.drawable.family_grandfather, R.raw.family_grandfather))
        val familyAdapter = wordAdapter(this, familyList, R.color.category_family_light)
        val family_listview = findViewById<ListView>(R.id.item_listview)
        family_listview.adapter = familyAdapter
        family_listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val position = familyList[i]
            val mediaPlayer = MediaPlayer.create(this@family, position.audioResourceId)
            mediaPlayer.start()
        }
    }
}