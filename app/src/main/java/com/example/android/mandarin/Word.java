package com.example.android.mandarin;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Mandarin translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mEnglishTranslation;

    /** Mandarin translation for the word */
    private String mPinyinTranslation;

    /** Image resource ID */
    private int mImageResourceId;

    /** Set at No Image state by default */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String englishTranslation, String pinyinTranslation) {
        mEnglishTranslation = englishTranslation;
        mPinyinTranslation = pinyinTranslation;
    }

    public Word(String englishTranslation, String pinyinTranslation, int imageResourceId) {
        mEnglishTranslation = englishTranslation;
        mPinyinTranslation = pinyinTranslation;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the Engilsh translation of the word.
     * @return
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * Get the Pinyin translation of the word.
     * @return
     */
    public String getPinyinTranslation() {
        return mPinyinTranslation;
    }

    /**
     * Get Image resource ID.
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word/phrase.
     * If mImageResourceId got changed to imageResourceId up in the public Word constructor
     * section of this routine, that means that Word entry DOES have a valid image associated with it.
     * If mImageResourceId is still stuck at its initial value of NO_IMAGE_PROVIDED, then we know
     * that Word entry does NOT have a valid image associated with it.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
