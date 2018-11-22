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

    public Word(String englishTranslation, String pinyinTranslation) {
        mEnglishTranslation = englishTranslation;
        mPinyinTranslation = pinyinTranslation;
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

}
