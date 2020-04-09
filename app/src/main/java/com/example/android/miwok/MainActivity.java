/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view that shows all the categories
        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);

        //set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Activity_Numbers.class);
                startActivity(numberIntent);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the family view is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, Activity_Family.class);
                startActivity(familyIntent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the colors view is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Activity_Colors.class);
                startActivity(colorsIntent);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            //the code in this method will be executed when the phrases view is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, Activity_Phrases.class);
                startActivity(phrasesIntent);
            }
        });
    }
    //opens family activity
    public void openFamilyList(View view) {
        Intent family = new Intent(this, Activity_Family.class);
        startActivity(family);
    }

    //opens colors activity
    public void openColorsList(View view) {
        Intent colors = new Intent(this, Activity_Colors.class);
        startActivity(colors);
    }

    //opens phrases activity
    public void openPhrasesList(View view) {
        Intent phrases = new Intent(this, Activity_Phrases.class);
        startActivity(phrases);
    }
}
