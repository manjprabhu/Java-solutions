package com.mnj.java_solutions.string;

import java.util.HashMap;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and
 * a non-empty word in s.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 **/

public class WordPatternLC290 {

    public void wordPattern() {
        String str = "dog cat cat dog";
        String pattern = "abba";

        HashMap<Character, String> map = new HashMap<>();
        String[] words = str.split(" ");

        if (words.length != pattern.length()) {
            System.out.println("==>> False");
            return;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char current_char = pattern.charAt(i);

            if (map.containsKey(current_char)) {
                if (!map.get(current_char).equals(words[i])) {
                    System.out.println("==>> False");
                    return;
                }

            } else {
                if (map.containsValue(words[i])) {
                    System.out.println("==>> False");
                    return;
                }
                map.put(current_char, words[i]);
            }
        }
    }
}
