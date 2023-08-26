package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

/**
 * A string is good if there are no repeated characters.
 * <p>
 * Given a string s, return the number of good substrings of length three in s.
 * <p>
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 * <p>
 * A substring is a contiguous sequence of characters in a string.
 * <p>
 * Input: s = "xyzzaz"
 * Output: 1
 * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
 * The only good substring of length 3 is "xyz".
 **/
public class SubstringsOfSizeThreeWithDistinctCharsLC1876 {
    public void countGoodSubstrings() {

        String s = "aababcabc";
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (j - i + 1 < 3) {
                j++;
            } else if (j - i + 1 == 3) {
                if (map.size() == 3) {
                    count++;
                }
                int val = map.get(s.charAt(i));
                val = val - 1;
                if (val == 0) {
                    map.remove(s.charAt(i));
                } else {
                    map.put(s.charAt(i), val);
                }
                i++;
                j++;
            }
        }
        System.out.println("==>> Result is :" + count);
    }
}
