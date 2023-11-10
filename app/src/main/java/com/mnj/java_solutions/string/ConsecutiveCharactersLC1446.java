package com.mnj.java_solutions.string;

/**
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 *
 * Given a string s, return the power of s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e' only.
 * Example 2:
 *
 * Input: s = "abbcccddddeeeeedcba"
 * Output: 5
 * Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 *
 *
 *  **/
public class ConsecutiveCharactersLC1446 {

    public void maxPower() {
        String s = "abbcccddddeeeeedcba";
        int count = 1, max_count = 1;
        char prev = s.charAt(0);
        for(int i = 1; i < s.length(); ++i){
            if(s.charAt(i) == prev){
                count++;
                max_count = Math.max(max_count, count);
            } else {
                count = 1;
                prev = s.charAt(i);
            }
        }

        System.out.println("==>> Max count is :"+max_count);
    }
}
