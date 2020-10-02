package com.example.learnit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numbersList = new ArrayList<>();
        numbersList.add(new word("One","Un"));
        numbersList.add(new word("Two","Deux"));
        numbersList.add(new word("Three","Trois"));
        numbersList.add(new word("Four","Quatre"));
        numbersList.add(new word("Five","Cinq"));
        numbersList.add(new word("Six","Six"));
        numbersList.add(new word("Seven","Sept"));
        numbersList.add(new word("Eight","Huit"));
        numbersList.add(new word("Nine","Nuef"));
        numbersList.add(new word("Ten","Dix"));
        wordAdapter numbersAdapter = new wordAdapter(this,numbersList);
        ListView numbers_listview = findViewById(R.id.item_listview);
        numbers_listview.setAdapter(numbersAdapter);
    }
}