package com.example.learnit

class word {
    var defaultTranslation: String
        private set
    var frenchTranslation: String
        private set
    var imageResourceID: Int
        private set
    var audioResourceId: Int
        private set

    constructor(defaultTranslation: String, frenchTranslation: String) {
        this.defaultTranslation = defaultTranslation
        this.frenchTranslation = frenchTranslation
        imageResourceID = 0
        audioResourceId = 0
    }

    constructor(defaultTranslation: String, frenchTranslation: String, imageResourceID: Int, audioResourceId: Int) {
        this.defaultTranslation = defaultTranslation
        this.frenchTranslation = frenchTranslation
        this.imageResourceID = imageResourceID
        this.audioResourceId = audioResourceId
    }
}