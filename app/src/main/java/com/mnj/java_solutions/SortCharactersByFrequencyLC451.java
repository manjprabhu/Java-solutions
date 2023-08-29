package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
 * <p>
 * Return the sorted string. If there are multiple answers, return any of them.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "tree"
 * Output: "eert"
 * Explanation: 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cccaaa"
 * Output: "aaaccc"
 * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 **/
public class SortCharactersByFrequencyLC451 {

    public void frequencySort() {
        String s = "cccaaabbnm";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars, (a, b) -> (map.get(b) - map.get(a)));

        StringBuilder result = new StringBuilder();
        for (Object c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }
        System.out.println("==>> result String is :" + result);
    }
}
