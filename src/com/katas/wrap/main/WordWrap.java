package com.katas.wrap.main;

public class WordWrap {
    public static String wrap(String text, int maxLength) {
        if(text.length()<maxLength)
            return text;

        return "";
    }
}
