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
        colorsList.add(new word("Red", "Rouge"));
        colorsList.add(new word("Orange", "Orange"));
        colorsList.add(new word("Yellow", "Jaune"));
        colorsList.add(new word("Green", "Vert"));
        colorsList.add(new word("blue", "Bleu"));
        colorsList.add(new word("Violet", "Violet"));
        colorsList.add(new word("Black", "Noir"));

        wordAdapter colorsAdapter = new wordAdapter(this, colorsList);
        ListView colors_listview = findViewById(R.id.item_listview);
        colors_listview.setAdapter(colorsAdapter);
    }
}