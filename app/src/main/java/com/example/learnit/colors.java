package com.example.learnit;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> colorsList = new ArrayList<>();
        colorsList.add(new word("Red", "Rouge", R.drawable.color_red, R.raw.color_red));
        colorsList.add(new word("Orange", "Orange", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsList.add(new word("Yellow", "Jaune", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        colorsList.add(new word("Green", "Vert", R.drawable.color_green, R.raw.color_green));
        colorsList.add(new word("Gray", "Grise", R.drawable.color_gray, R.raw.color_green));
        colorsList.add(new word("White", "Blanche", R.drawable.color_white, R.raw.color_white));
        colorsList.add(new word("Black", "Noir", R.drawable.color_black, R.raw.color_black));

        wordAdapter colorsAdapter = new wordAdapter(this, colorsList, R.color.category_colors_light);
        ListView colors_listview = findViewById(R.id.item_listview);
        colors_listview.setAdapter(colorsAdapter);
        colors_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word position = colorsList.get(i);
                MediaPlayer mediaPlayer = MediaPlayer.create(colors.this, position.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}