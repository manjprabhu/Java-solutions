package com.mnj.java_solutions.string;

/**
 * Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters.
 *
 * Example 1:
 *
 * Input:
 * S = "aba", K = 2
 * Output:
 * 3
 * Explanation:
 * The substrings are: "ab", "ba" and "aba".
 * Example 2:
 *
 * Input:
 * S = "abaaca", K = 1
 * Output:
 * 7
 * Explanation:
 * The substrings are: "a", "b", "a", "aa", "a", "c", "a".
 * **/
public class CountNumberOfSubstrings05102023 {

    public void substrCount() {

        String S = "aba", int K = 2

        long result =  atmost(S, K) - atmost(S, K - 1);
        System.out.println("==>> Result :"+result);
    }

    private long atmost(String s, int k) {
        int arr[] = new int[26];

        int dist = 0, left = 0;
        long res = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            if (arr[s.charAt(i) - 'a'] == 1) dist++;

            while (dist > k) {
                arr[s.charAt(left) - 'a']--;
                if (arr[s.charAt(left) - 'a'] == 0) dist--;
                left++;
            }

            res = res + (i - left + 1);
        }
        return res;
    }
}
