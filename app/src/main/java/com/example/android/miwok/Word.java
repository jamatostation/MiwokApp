package com.example.android.miwok;

import android.content.Context;

public class Word {
    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private Integer mImageId;


    // Build the class/constructors
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, Integer imageId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageId = imageId;
    }


    // Get the translations/images
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public Integer getmImageId() {
        return mImageId;
    }

}
