package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set arrayList for english colors
        ArrayList<Word> words = new ArrayList<Word>();
        //add Word objects to words arraylist
        words.add(new Word("red", "wetetti",R.drawable.color_red));
        words.add(new Word("green", "chokokki",R.drawable.color_green));
        words.add(new Word("brown", "takaakki",R.drawable.color_brown));
        words.add(new Word("gray", "topoppi",R.drawable.color_gray));
        words.add(new Word("black", "kululli",R.drawable.color_black));
        words.add(new Word("white", "kelelli",R.drawable.color_white));
        words.add(new Word("dusty yellow", "topiise",R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiite",R.drawable.color_mustard_yellow));

        // Create ArrayAdapter
        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);
        // Find ListView
        ListView listView = (ListView) findViewById(R.id.list);
        // Run adapter
        listView.setAdapter(itemsAdapter);

    }

}
