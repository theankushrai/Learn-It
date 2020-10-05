package com.example.learnit;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> familyList = new ArrayList<>();
        familyList.add(new word("Father", "Pere", R.drawable.family_father));
        familyList.add(new word("Mother", "Mere", R.drawable.family_mother));
        familyList.add(new word("Son", "Fils", R.drawable.family_son));
        familyList.add(new word("Daughter", "Fille", R.drawable.family_daughter));
        familyList.add(new word("Brother", "Frere", R.drawable.family_older_brother));
        familyList.add(new word("Sister", "Soeur", R.drawable.family_older_sister));
        familyList.add(new word("Grandmother", "Grand-mere", R.drawable.family_grandmother));
        familyList.add(new word("Grandfather", "Grand-Pere", R.drawable.family_grandfather));


        wordAdapter familyAdapter = new wordAdapter(this, familyList, R.color.category_family_light);
        ListView family_listview = findViewById(R.id.item_listview);
        family_listview.setAdapter(familyAdapter);
    }
}