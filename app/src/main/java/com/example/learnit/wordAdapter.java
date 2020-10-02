package com.example.learnit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class wordAdapter extends ArrayAdapter<word> {

    public wordAdapter(@NonNull Context context, ArrayList<word> words) {
        super(context, 0,words);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView= convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        word currentWord = getItem(position);

        TextView defaultTextview=listItemView.findViewById(R.id.default_language_textview);
        defaultTextview.setText(currentWord.getDefaultTranslation());

        TextView frenchTextView = listItemView.findViewById(R.id.french_language_textview);
        frenchTextView.setText(currentWord.getFrenchTranslation());
        return listItemView;
    }


}
