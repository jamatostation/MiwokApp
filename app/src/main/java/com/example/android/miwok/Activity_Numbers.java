package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set arrayList for english numbers
        ArrayList<Word> words = new ArrayList<Word>();
        //add Word objects to words arraylist
        words.add(new Word("one", "lutti",R.drawable.number_one));
        words.add(new Word("two", "otiiko",R.drawable.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo'e",R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha",R.drawable.number_ten));

        // Create ArrayAdapter
        WordAdapter itemsAdapter = new WordAdapter(this, words);
        // Find ListView
        ListView listView = (ListView) findViewById(R.id.list);
        // Run adapter
        listView.setAdapter(itemsAdapter);

    }

}
