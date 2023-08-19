package com.mnj.java_solutions.slidingwindow;

/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * <p>
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 **/
public class MaximumNumberofVowelsinSubstringofGivenLengthLC1456 {

    public void maxVowels() {
        String s = "aeiou";
        int k = 2;

        int start = 0;
        int end = 0;

        int max = 0;
        int count = 0;

        while (end < s.length()) {
            if (isVowel(s.charAt(end)))
                count++;
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {

                max = Math.max(max, count);
                if (isVowel(s.charAt(start)))
                    count--;

                end++;
                start++;

            }
        }
        System.out.println("==>>> Maximum vowels in given substring is : " + max);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
