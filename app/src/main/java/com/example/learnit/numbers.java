package com.example.learnit;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numbersList = new ArrayList<>();
        numbersList.add(new word("One", "Un", R.drawable.number_one));
        numbersList.add(new word("Two", "Deux", R.drawable.number_two));
        numbersList.add(new word("Three", "Trois", R.drawable.number_three));
        numbersList.add(new word("Four", "Quatre", R.drawable.number_four));
        numbersList.add(new word("Five", "Cinq", R.drawable.number_five));
        numbersList.add(new word("Six", "Six", R.drawable.number_six));
        numbersList.add(new word("Seven", "Sept", R.drawable.number_seven));
        numbersList.add(new word("Eight", "Huit", R.drawable.number_eight));
        numbersList.add(new word("Nine", "Nuef", R.drawable.number_nine));
        numbersList.add(new word("Ten", "Dix", R.drawable.number_ten));
        wordAdapter numbersAdapter = new wordAdapter(this, numbersList, R.color.category_numbers_light);
        ListView numbers_listview = findViewById(R.id.item_listview);
        numbers_listview.setAdapter(numbersAdapter);
    }
}