package com.example.android.miwok;



public class Word {
    private String englishWord , miwokWord ;
    private int imageResourceId, audioResourceId;

    public Word(String englishWord, String miwokWord, int imageResourceId, int audioResourceId) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
    }


    public Word(String englishWord, String miwokWord, int audioResourceId) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.audioResourceId = audioResourceId;
    }

    public Word(String englishWord, String miwokWord) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public void setAudioResourceId(int audioResourceId) {
        this.audioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "englishWord='" + englishWord + '\'' +
                ", miwokWord='" + miwokWord + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
