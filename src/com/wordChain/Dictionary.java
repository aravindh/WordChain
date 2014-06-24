package com.wordChain;

import java.util.ArrayList;

/**
 * Created by hadoop on 24/6/14.
 */
public class Dictionary {
    private static Dictionary ourInstance = new Dictionary();
    private static ArrayList<String> words;

    public static Dictionary getInstance() {
        return ourInstance;
    }

    private Dictionary() {
        words.add("cat");
        words.add("cot");
        words.add("dot");
        words.add("dog");
        words.add("cog");
    }

    public static boolean isDictionaryWord(String word) {
        return words.contains(word);
    }
}
