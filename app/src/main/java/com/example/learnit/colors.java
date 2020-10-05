package com.example.learnit;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> colorsList = new ArrayList<>();
        colorsList.add(new word("Red", "Rouge", R.drawable.color_red));
        colorsList.add(new word("Orange", "Orange", R.drawable.color_dusty_yellow));
        colorsList.add(new word("Yellow", "Jaune", R.drawable.color_mustard_yellow));
        colorsList.add(new word("Green", "Vert", R.drawable.color_green));
        colorsList.add(new word("Gray", "Grise", R.drawable.color_gray));
        colorsList.add(new word("White", "Blanche", R.drawable.color_white));
        colorsList.add(new word("Black", "Noir", R.drawable.color_black));

        wordAdapter colorsAdapter = new wordAdapter(this, colorsList, R.color.category_colors_light);
        ListView colors_listview = findViewById(R.id.item_listview);
        colors_listview.setAdapter(colorsAdapter);
    }
}