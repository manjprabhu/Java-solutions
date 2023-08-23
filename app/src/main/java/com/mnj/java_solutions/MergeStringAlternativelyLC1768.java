package com.mnj.java_solutions;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 **/
public class MergeStringAlternativelyLC1768 {

    public String mergeAlternately() {
        String word1 = "abc", word2 = "pqr";

        StringBuilder sb = new StringBuilder();

        int length = word1.length() + word2.length();

        int firstIndex = 0, secondIndex = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                if (firstIndex < word1.length())
                    sb.append(word1.charAt(firstIndex++));
                else sb.append(word2.charAt(secondIndex++));
            } else {
                if (secondIndex < word2.length())
                    sb.append(word2.charAt(secondIndex++));
                else sb.append(word1.charAt(firstIndex++));
            }
        }
        return sb.toString();
    }
}
