package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> wordsList, int color) {
        super (context, 0, wordsList);
        mColor = color;
    }

    public WordAdapter(@NonNull Context context, int resource, @NonNull Word[] objects) {
        super(context, resource, objects);
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

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.wordImage);

        // Set color
        View textContainer = listItemView.findViewById(R.id.layout);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);

        //Check if there is an imageview
        if (currentWord.getmImageId()==1234) {
            // Set the imageView to invisible
            imageView.setVisibility(View.GONE);

        }else {
            // Set the image onto the view
            imageView.setImageResource(currentWord.getmImageId());
            // Set to be visible
            imageView.setVisibility(View.VISIBLE);
        }




        return listItemView;
    }


}
