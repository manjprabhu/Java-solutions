package com.mnj.java_solutions.slidingwindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharactersLC3 {

    public void lengthOfLongestSubstring() {
        String s = "pwwkew";

        String output = "";

        for (int i = 0; i < s.length(); i++) { // start index
            HashSet<Character> visited = new HashSet<>();

            int j = i;

            for (; j < s.length(); j++) {  // end index
                char current = s.charAt(j);

                if (visited.contains(current)) {
                    break;
                } else {
                    visited.add(current);
                }
            }
            if (output.length() < j - i + 1) {
                output = s.substring(i, j);
            }
        }
        System.out.println("==>> Length  Longest Substring Without Repeating Characters: " + output.length());
    }

    public void lengthOfLongestSubstring2() {
        String s = "abcabcbb";

        int i = 0;// start pointer
        int j = 0;//end pointer
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println("==>> 2 Length  Longest Substring Without Repeating Characters: " + max);
    }
}
