package org.illumio.technical.assessment;

import java.nio.file.Files;
import java.util.HashMap;

public class WordsCount {
    public static void main(String[] args) throws Exception {

        // Get Predefined Words
        String preDefinedWordsFile = "preDefinedWords";
        PredefinedWords predefinedWords = new PredefinedWords();
        String getPredefinedWordContent = predefinedWords.getPredefinedWordContent
                (preDefinedWordsFile);
        String[] getArrayOfPredefinedWords = predefinedWords.getArrayOfPredefinedWords
                (getPredefinedWordContent);
        HashMap<String, String> mapPredefinedWords = predefinedWords.getPredefinedWords
                (getArrayOfPredefinedWords);

        // Get words from file
        String fileName = "sampleFile.txt";
        WordsInFile wordsInFile = new WordsInFile();
        String getFileContent = wordsInFile.getFileContent(fileName);
        String[] getArrayOfWords = wordsInFile.getArrayOfWordsFromFile(getFileContent);

        // Count words from predefined words list
        CountPredefinedWords countPredefinedWords = new CountPredefinedWords();
        HashMap<String, Integer> countWords = countPredefinedWords.countPredefinedWords
                (getArrayOfWords, mapPredefinedWords);

        // Print the output in Table format
        System.out.printf("%-" + 10 + "s%" + 10 + "s%n", "PredefinedWord", "count");
        for (String key : countWords.keySet()) {
            String preDefinedWord = mapPredefinedWords.get(key);
            int count = countWords.get(key);
            System.out.printf("%-" + 10 + "s%" + 10 + "d%n", preDefinedWord, count);
        }
    }
}