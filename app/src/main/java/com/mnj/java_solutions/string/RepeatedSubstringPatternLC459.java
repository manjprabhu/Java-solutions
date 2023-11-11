package com.mnj.java_solutions.string;

/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 * <p>
 * Input: s = "aba"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 *
 * https://github.com/MAZHARMIK/Interview_DS_Algo/blob/master/strings/Repeated%20Substring%20Pattern.cpp
 **/
public class RepeatedSubstringPatternLC459 {

    public void repeatedSubstringPattern() {
        String str = "abab";

        int n = str.length();

        for (int l = n / 2; l >= 1; l--) {

            if (n % l == 0) {

                int times = n / l;
                String pattern = str.substring(0, l);
                StringBuilder newStr = new StringBuilder();

                while (times > 0) {
                    newStr.append(pattern);
                    times--;
                }

                if (str.equals(newStr.toString())) {
                    System.out.println("==>> Repeated Substring....");
                }

            }
        }
        System.out.println("==>> NOT a Repeated Substring....");
    }
}
