package org.illumio.technical.assessment;

import java.util.HashMap;

public class CountPredefinedWords {

    public HashMap countPredefinedWords(String[] wordsFromFile, HashMap mapPredefinedWords) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for( String word : wordsFromFile) {
            // max length of word is 256
            if (word.length() > 256) {
                System.out.println("Word length is above maximum limit");
                continue;
            }
            String processedWord = word.toLowerCase();
            if (mapPredefinedWords.containsKey(processedWord)){
                if (wordCountMap.containsKey(processedWord)) {
                    wordCountMap.put(processedWord, wordCountMap.get(processedWord) + 1);
                } else {
                    wordCountMap.put(processedWord, 1);
                }
            }
        }
        return wordCountMap;
    }

}
