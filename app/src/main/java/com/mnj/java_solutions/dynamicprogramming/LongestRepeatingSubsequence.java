package com.mnj.java_solutions.dynamicprogramming;

import java.util.Arrays;

public class LongestRepeatingSubsequence {

    static int lrs(StringBuilder s1, int i, int j, int[][] dp) {
        if (i >= s1.length() || j >= s1.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (dp[i][j] == -1) {
            if (s1.charAt(i) == s1.charAt(j) && i != j) {
                dp[i][j] = 1 + lrs(s1, i + 1, j + 1, dp);
            } else {
                dp[i][j] = Math.max(lrs(s1, i, j + 1, dp), lrs(s1, i + 1, j, dp));
            }
        }
        return dp[i][j];
    }

    //Brute force approch
    public void longestRepeatingSubsequence() {

        String str = "aabb";
        int n = str.length();

        // Create and initialize DP table
        int[][] dp = new int[n + 1][n + 1];

        // Fill dp table (similar to LCS loops)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match and indexes are not same
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    // If characters do not match
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        System.out.println("==>> Longest repeating subsequence :" + dp[n][n]);
    }

    //Using Dynamic programming
    public void longestRepeatingSubsequence2() {

        String s1 = "aabb";
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(s1);

        // reverse StringBuilder input1
        input1.reverse();
        int[][] dp = new int[1000][1000];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("==>> LENGTH  Longest repeating subsequence : :" +
                lrs(input1, 0, 0, dp));
    }
}
