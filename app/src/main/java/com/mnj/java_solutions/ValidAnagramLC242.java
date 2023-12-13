package com.mnj.java_solutions;

/***
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *
 * typically using all the original letters exactly once.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * ***/
public class ValidAnagramLC242 {

    void isValidAnagram() {
        String st1 = "anagram";
        String st2 = "nagaramm";

        if (st1.length() != st2.length()) {
            System.out.println("==>> False");
            return;
        }

        int[] char_counts = new int[26];

        //Fill the bucket array
        for (int i = 0; i < st1.length(); i++) {
            char_counts[st1.charAt(i) - 'a']++;
        }

        //Empty the bucket array
        for (int i = 0; i < st2.length(); i++) {
            char_counts[st2.charAt(i) - 'a']--;
        }

        for (int count : char_counts) {
            if (count != 0) {
                System.out.println("==>> False");
            }
        }
        System.out.println("==>> True");
    }
}
