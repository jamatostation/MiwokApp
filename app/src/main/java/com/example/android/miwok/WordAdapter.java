package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> wordsList) {
        super(context, 0, wordsList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Set words
        Word currentWord = getItem(position);

        // Default translation
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.englishWordVariable);

        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // Miwok Translation
        TextView miwokTextview = (TextView) listItemView.findViewById(R.id.miwokWordVariable);

        miwokTextview.setText(currentWord.getmMiwokTranslation());


        return listItemView;
    }


}
