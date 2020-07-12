package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int resourceId;

    public Word(String miwokTranslation, String defaultTranslation, int resourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.resourceId = resourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
