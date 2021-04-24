package com.example.learnit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.util.*

class wordAdapter(context: Context, words: ArrayList<word>, private val colorResourceId: Int) : ArrayAdapter<word?>(context, 0, words as List<word?>) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val currentWord = getItem(position)
        val defaultTextview = listItemView!!.findViewById<TextView>(R.id.default_language_textview)
        defaultTextview.text = currentWord!!.defaultTranslation
        val frenchTextView = listItemView.findViewById<TextView>(R.id.french_language_textview)
        frenchTextView.text = currentWord.frenchTranslation
        if (currentWord.imageResourceID != 0) {
            val item_imageview = listItemView.findViewById<ImageView>(R.id.item_imageview)
            item_imageview.setImageResource(currentWord.imageResourceID)
        }
        val item_linearlayout = listItemView.findViewById<View>(R.id.item_linearlayout)
        val color = ContextCompat.getColor(context, colorResourceId)
        item_linearlayout.setBackgroundColor(color)
        return listItemView
    }
}