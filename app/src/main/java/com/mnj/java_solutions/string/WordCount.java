package com.mnj.java_solutions.string;

//Count the number of words in a sentence
public class WordCount {

    public void wordCount() {
        String str = "This is testing for word count";

        if (str == null || str.isEmpty()) {
            System.out.println("==>> Number of words are zero");
            return;
        }

        String[] words = str.split("\\s");
        System.out.println("==>> Number of words is:" + words.length);
    }
}
