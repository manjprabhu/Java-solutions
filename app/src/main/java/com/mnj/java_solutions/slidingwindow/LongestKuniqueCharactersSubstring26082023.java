package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

/***
 * Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.
 *
 * Input:
 * S = "aabacbebebe", K = 3
 * Output:
 * 7
 * Explanation:
 * "cbebebe" is the longest substring with 3 distinct characters.
 * **/
public class LongestKuniqueCharactersSubstring26082023 {

    public void longestkSubstr() {
        String s = "aabacbebebe";
        int k = 3;

        int i = 0;
        int j = 0;
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.size() == k) {
                result = Math.max(result, j - i + 1);
            }
            while (map.size() > k) {
                char x = s.charAt(i);
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0)
                    map.remove(x);
                    i++;
            }
            j++;
        }
        System.out.println("==>> Longest substring with k unique chars are :"+result);
    }
}
