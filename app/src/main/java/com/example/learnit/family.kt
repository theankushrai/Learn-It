package com.example.learnit;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> familyList = new ArrayList<>();
        familyList.add(new word("Father", "Pere", R.drawable.family_father, R.raw.family_father));
        familyList.add(new word("Mother", "Mere", R.drawable.family_mother, R.raw.family_mother));
        familyList.add(new word("Son", "Fils", R.drawable.family_son, R.raw.family_son));
        familyList.add(new word("Daughter", "Fille", R.drawable.family_daughter, R.raw.family_daughter));
        familyList.add(new word("Brother", "Frere", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyList.add(new word("Sister", "Soeur", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyList.add(new word("Grandmother", "Grand-mere", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyList.add(new word("Grandfather", "Grand-Pere", R.drawable.family_grandfather, R.raw.family_grandfather));


        wordAdapter familyAdapter = new wordAdapter(this, familyList, R.color.category_family_light);
        ListView family_listview = findViewById(R.id.item_listview);
        family_listview.setAdapter(familyAdapter);
        family_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word position = familyList.get(i);
                MediaPlayer mediaPlayer = MediaPlayer.create(family.this, position.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}