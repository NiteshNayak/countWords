# **Count Predefined word occurrences**

## **Description**

This program counts the number of occurrences of predefined words from a file.

## **Features**

- get Predefined words
- read the file
- check if the words in file is a predefined word
- print the output

## **Requirements**
- Predefined words are unique
- Maximum length of word from file can be upto 256
- Maximum 10k entries in predefined words

## **Design Approach**

There is a 3-step approach for this project

- Get all the pre-defined words from a file located in resources folder "preDefinedWords".
While doing so, we are storing the words in lowercase as well as original format.
Pros: Processing time is much faster as the words lookup is quicker.
Cons: Extra data structure is used to store the processed word and the original format for output.

- Get all the words from file using regex by splitting words based on any non-word character.

- Check if the word from file matches any predefined words. If they do then increase the count.


## **Prerequisites**

- Java Development Kit (JDK) installed on your system.
- Integrated Development Environment (IDE) to write and edit code.


## **Project Structure**

countPredefinedWords/
├── src/
│   └── main/
│         └── java/
│              └── org.illumio.technical.assessment/
│                              └── CountPredefinedWords
│                              └── PredefinedWords
│                              └── WordsCount
│                              └── WordsInFile
├── resources/
│   └── preDefinedWords
│   └── sampleFile
│
└── README.md

- WordsCount : This is the main class program to be run which brings all logic together
- preDefinedWords : This is a file which contains Predefined words
- sampleFile : This is the file which needs to be scanned to understand if it contains predefined words
- README.md : Current document.

## **Sample Input Files**

- Predefined words

Name
Detect
AI
FirstName
LastName
Zipcode

- Sample file

Line 1: Detecting first names is tricky to do even with AI.

Line 2: how do you say a street name is not a first name?

Line 3: ai! ai? aI/

Line 4: firstNAME and LASTname?

## **Sample Output**

- Below is the sample output of above input files

PredefinedWord     count
FirstName          1
AI                 4
Name               2
LastName           1

