package com.example.learnit;

public class word {

    private String defaultTranslation;
    private String frenchTranslation;
    private int imageResourceID;
    private int audioResourceId;

    public word(String defaultTranslation, String frenchTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
        imageResourceID = 0;
        audioResourceId = 0;
    }

    public word(String defaultTranslation, String frenchTranslation, int imageResourceID, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceId = audioResourceId;

    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getFrenchTranslation() {
        return frenchTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
