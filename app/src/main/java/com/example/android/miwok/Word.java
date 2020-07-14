package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private final int defaultResourceId = -1;
    private int resourceId = defaultResourceId;
    private int soundId;


    public Word(String miwokTranslation, String defaultTranslation, int resourceId, int soundId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.resourceId = resourceId;
        this.soundId = soundId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int soundId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.soundId = soundId;

    }

    public int getSoundId() {
        return soundId;
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

    public boolean isImage() {
        return this.defaultResourceId != this.resourceId;
    }
}
