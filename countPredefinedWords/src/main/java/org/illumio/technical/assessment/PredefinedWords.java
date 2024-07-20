package org.illumio.technical.assessment;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.HashMap;

public class PredefinedWords {
    public String getPredefinedWordContent(String fileName) {

        InputStream inputStream = PredefinedWords.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            System.out.println("File not found!");
            return null;
        }
        try {
            String fileContent = new String(inputStream.readAllBytes());
            return fileContent;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String[] getArrayOfPredefinedWords(String fileContent) {
        // max predefined words are upto 10k entries.
        int maxPredefinedWord = 10000;
        String[] wordArray = fileContent.split(System.lineSeparator(), maxPredefinedWord);
        if (wordArray.length == maxPredefinedWord) {
            System.out.println("Using Maximum Limit of Predefined Words");
        }
        return wordArray;
    }

    public HashMap getPredefinedWords(String[] arrayOfPredefinedWords) {
        HashMap<String, String> preDefinedWords = new HashMap<>();
        for (String eachWord : arrayOfPredefinedWords) {
            // unique predefined words
            if (preDefinedWords.containsKey(eachWord.toLowerCase())) {
                continue;
            }
            preDefinedWords.put(eachWord.toLowerCase(), eachWord);
        }
        return preDefinedWords;
    }

}
