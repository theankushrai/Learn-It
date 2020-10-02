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
        familyList.add(new word("Father", "Pere"));
        familyList.add(new word("Mother", "Mere"));
        familyList.add(new word("Son", "Fils"));
        familyList.add(new word("Daughter", "Fille"));
        familyList.add(new word("Brother", "Frere"));
        familyList.add(new word("Sister", "Soeur"));
        familyList.add(new word("Grandmother", "Grand-mere"));
        familyList.add(new word("Grandfather", "Grand-Pere"));


        wordAdapter familyAdapter = new wordAdapter(this, familyList);
        ListView family_listview = findViewById(R.id.item_listview);
        family_listview.setAdapter(familyAdapter);
    }
}