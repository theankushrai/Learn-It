package com.example.learnit;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> numbersList = new ArrayList<>();
        numbersList.add(new word("One", "Un", R.drawable.number_one, R.raw.number_one));
        numbersList.add(new word("Two", "Deux", R.drawable.number_two, R.raw.number_two));
        numbersList.add(new word("Three", "Trois", R.drawable.number_three, R.raw.number_three));
        numbersList.add(new word("Four", "Quatre", R.drawable.number_four, R.raw.number_four));
        numbersList.add(new word("Five", "Cinq", R.drawable.number_five, R.raw.number_five));
        numbersList.add(new word("Six", "Six", R.drawable.number_six, R.raw.number_six));
        numbersList.add(new word("Seven", "Sept", R.drawable.number_seven, R.raw.number_seven));
        numbersList.add(new word("Eight", "Huit", R.drawable.number_eight, R.raw.number_eight));
        numbersList.add(new word("Nine", "Nuef", R.drawable.number_nine, R.raw.number_nine));
        wordAdapter numbersAdapter = new wordAdapter(this, numbersList, R.color.category_numbers_light);
        ListView numbers_listview = findViewById(R.id.item_listview);
        numbers_listview.setAdapter(numbersAdapter);
        numbers_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word position = numbersList.get(i);
                MediaPlayer mediaPlayer = MediaPlayer.create(numbers.this, position.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}