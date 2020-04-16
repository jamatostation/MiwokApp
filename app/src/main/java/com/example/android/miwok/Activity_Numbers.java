package com.example.android.miwok;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__numbers);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set arrayList for english numbers
        ArrayList<String> numbersEnglish = new ArrayList<String>();
        //set list items
        numbersEnglish.add("one");
        numbersEnglish.add("two");
        numbersEnglish.add("three");
        numbersEnglish.add("four");
        numbersEnglish.add("five");
        numbersEnglish.add("six");
        numbersEnglish.add("seven");
        numbersEnglish.add("eight");
        numbersEnglish.add("nine");
        numbersEnglish.add("ten");

        // Keep looping intil we've reached the end of the list
        for (int index = 0; index < numbersEnglish.size(); index++) {
            // Create new TextView
            TextView wordView = new TextView(this);

            // Set this text to be word at the current index
            wordView.setText(numbersEnglish.get(index));

            // Add this TextView as another child to the roof view of this layout
            rootView.addView(wordView);

        }

        //check items in the debug log
        Log.d("Activity_Numbers", "Word at index 0: " + numbersEnglish.get(0));
        Log.d("Activity_Numbers", "Word at index 1: " + numbersEnglish.get(1));
        Log.d("Activity_Numbers", "Word at index 2: " + numbersEnglish.get(2));
        Log.d("Activity_Numbers", "Word at index 3: " + numbersEnglish.get(3));
        Log.d("Activity_Numbers", "Word at index 4: " + numbersEnglish.get(4));
        Log.d("Activity_Numbers", "Word at index 5: " + numbersEnglish.get(5));
        Log.d("Activity_Numbers", "Word at index 6: " + numbersEnglish.get(6));
        Log.d("Activity_Numbers", "Word at index 7: " + numbersEnglish.get(7));
        Log.d("Activity_Numbers", "Word at index 8: " + numbersEnglish.get(8));
        Log.d("Activity_Numbers", "Word at index 9: " + numbersEnglish.get(9));
    }

}
