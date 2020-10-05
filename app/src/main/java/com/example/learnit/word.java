package com.example.learnit;

public class word {

    private String defaultTranslation;
    private String frenchTranslation;
    private int imageResourceID;

    public word(String defaultTranslation, String frenchTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
        imageResourceID = 0;
    }

    public word(String defaultTranslation, String frenchTranslation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
        this.imageResourceID = imageResourceID;
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
}
