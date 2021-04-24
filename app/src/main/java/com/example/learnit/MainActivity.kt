package com.example.learnit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView colors= findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent= new Intent(MainActivity.this, colors.class);
                startActivity(colorsIntent);
            }
        });
        TextView family=findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent=new Intent(MainActivity.this,family.class);
                startActivity(familyIntent);
            }
        });
        TextView numbers= findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,numbers.class);
                startActivity(numbersIntent);
            }
        });
        final TextView phrases=findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent=new Intent(MainActivity.this , phrases.class);
                startActivity(phrasesIntent);
            }
        });

    }
}