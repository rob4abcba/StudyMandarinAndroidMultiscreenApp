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

    /** Simplified Chinese character for the word */
    private String mSimplifiedChineseChar;

    /** Image resource ID */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Set at No Image state by default */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;


    public Word(String englishTranslation, String pinyinTranslation, String simplifiedChineseChar, int audioResourceId) {
        mEnglishTranslation = englishTranslation;
        mPinyinTranslation = pinyinTranslation;
        mSimplifiedChineseChar = simplifiedChineseChar;
        mAudioResourceId =  audioResourceId;
    }

    public Word(String englishTranslation, String pinyinTranslation, String simplifiedChineseChar, int imageResourceId, int audioResourceId) {
        mEnglishTranslation = englishTranslation;
        mPinyinTranslation = pinyinTranslation;
        mSimplifiedChineseChar = simplifiedChineseChar;
        mImageResourceId = imageResourceId;
        mAudioResourceId =  audioResourceId;
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
     * Get the Simplified Chinese character of the word.
     * @return
     */
    public String getSimplifiedChineseChar() {
        return mSimplifiedChineseChar;
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

    /**
     * Get Audio resource ID.
     * @return
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
