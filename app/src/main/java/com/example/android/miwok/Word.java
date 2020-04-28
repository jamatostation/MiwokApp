package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import static android.widget.ImageView.*;

public class Word {
    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private Integer mImageId;

    private Integer mColor;



    // Build the class/constructors
    /**
     *
     * @param defaultTranslation sets the english word we have up
     * @param miwokTranslation sets the translation for the word we have up
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageId = 1234;

    }



    /**
     *
     * @param defaultTranslation same
     * @param miwokTranslation same
     * @param imageId sets the pic for the word
     */
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
