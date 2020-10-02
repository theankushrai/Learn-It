package com.example.learnit;

public class word {

    private String defaultTranslation;
    private String frenchTranslation;

    public word(String defaultTranslation, String frenchTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getFrenchTranslation() {
        return frenchTranslation;
    }
}
