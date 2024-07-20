package org.illumio.technical.assessment;


public class WordsInFile {

    public String getFileContent(String fileName) {
        PredefinedWords predefinedWords = new PredefinedWords();
        return predefinedWords.getPredefinedWordContent(fileName);
    }

    public String[] getArrayOfWordsFromFile(String fileContent) {
        String[] wordArray = fileContent.split("\\W+");
        return wordArray;
    }

}
