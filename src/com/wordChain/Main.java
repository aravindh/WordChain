package com.wordChain;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public ArrayList<String> getChain(ArrayList<Integer> indexes, String src, String target) {
        if(!Dictionary.isDictionaryWord(src))
        {
            return null;
        }

        for (int idx: indexes) {
            String modified = ;

            modified.charAt(idx) = target.charAt(idx);
            indexes.remove(idx);
            ArrayList<String> path = getChain(indexes, src, target);
            if(!path.isEmpty()) {
                path.add(0, src);
                return path;
            }
            else
            {
                return null;
            }
        }

    }
}

