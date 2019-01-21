package com.bigId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matcher {

    public Map<String, List<Integer>> findWords(String text, List<String> words) {
        Map<String, List<Integer>> wordsIndexes = new HashMap<>();

        for (String word : words) {
            System.out.println(word + " indexes:");
            int index = 0;
            while(index != -1){
                index = text.indexOf(word, index);
                if (index != -1) {
                    //if word is already in map - add index to its list
                    if (wordsIndexes.containsKey(word)) {
                        wordsIndexes.get(word).add(index);
                    }
                    //if word not exist - create new entry for it
                    else {
                        List<Integer> indexes = new ArrayList<>();
                        indexes.add(index);
                        wordsIndexes.put(word, indexes);
                    }
                    System.out.print(index + " , ");
                    index++;
                }
            }
            System.out.println();
        }

        return wordsIndexes;
    }


    public List<Integer> findWord(String textString, String word) {
        List<Integer> indexes = new ArrayList<>();
        String lowerCaseTextString = textString.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        int index = 0;
        while(index != -1){
            index = lowerCaseTextString.indexOf(lowerCaseWord, index);
            if (index != -1) {
                indexes.add(index);
                index++;
            }
        }
        return indexes;
    }


}
