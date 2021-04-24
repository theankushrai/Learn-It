package com.example.learnit;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> phrasesList = new ArrayList<>();
        phrasesList.add(new word("Hi", "Salute"));
        phrasesList.add(new word("Bye", "Au Revoir"));
        phrasesList.add(new word("See You Again", "a la prochaine"));
        phrasesList.add(new word("Good Morning", "Bonjour"));
        phrasesList.add(new word("Good Night", "Bonne nuit"));
        phrasesList.add(new word("I love you", "je t'aime"));
        wordAdapter phrasesAdapter = new wordAdapter(this, phrasesList, R.color.category_phrases_light);
        ListView phrases_listview = findViewById(R.id.item_listview);
        phrases_listview.setAdapter(phrasesAdapter);

    }
}