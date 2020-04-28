package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set arrayList for english numbers
        ArrayList<Word> words = new ArrayList<Word>();
        //add Word objects to words arraylist
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinne oyaase'ne"));
        words.add(new Word("My name is...","oyaaset..."));
        words.add(new Word("How are you feeling?","michekses?"));
        words.add(new Word("I'm feeling good.","Are you coming?"));
        words.add(new Word("Yes, I'm coming.","hee'eenem"));
        words.add(new Word("I'm coming.","eenem"));
        words.add(new Word("Let's go.","yoowutis"));
        words.add(new Word("Come here.","enni'nem"));


        // Create ArrayAdapter
        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_phrases);
        // Find ListView
        ListView listView = (ListView) findViewById(R.id.list);
        // Run adapter
        listView.setAdapter(itemsAdapter);

    }

}
