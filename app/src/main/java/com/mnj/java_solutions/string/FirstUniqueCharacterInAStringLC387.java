package com.mnj.java_solutions.string;

import java.util.HashMap;

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * <p>
 * If it does not exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * Output: -1
 **/
public class FirstUniqueCharacterInAStringLC387 {

    public void firstUniqueChar() {
        String str = "leetcode";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) == 1) {
                System.out.println("==>> Index of first unique char is :" + i);
                return;
            }
        }
    }
}
