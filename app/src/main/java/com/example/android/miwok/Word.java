package com.example.android.miwok;

import android.content.Context;

public class Word {
    private String mMiwokTranslation;

    private String mDefaultTranslation;


    // Build the class
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }


    // Get the translations
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

}
