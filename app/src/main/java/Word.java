package com.example.android.miwok;

import android.graphics.drawable.Drawable;

public class Word {
    private String miwok;
    private String english;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int soundResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String miwok, String english, int soundResId) {
        this.miwok = miwok;
        this.english = english;
        this.soundResourceId = soundResId;
    }

    public Word(String miwok, String english, int imgId, int soundResId) {
        this.miwok = miwok;
        this.english = english;
        this.imageResourceId = imgId;
        this.soundResourceId = soundResId;
    }

    public String getDefaultTranslation() {
        return english;
    }

    public String getMiwokTranslation() {
        return miwok;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public boolean hasImage() {
        return (imageResourceId != NO_IMAGE_PROVIDED);
    }
}
