package com.mnj.java_solutions.string;

/**
 * Given two strings X and Y of lengths m and n respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.
 * Note: X and Y can have both uppercase and lowercase letters.
 * <p>
 * Example 1
 * <p>
 * Input:
 * X = abcd, Y = xycd
 * Output: 6
 * Explanation: Shortest Common Supersequence
 * would be abxycd which is of length 6 and
 * has both the strings as its subsequences.
 * Example 2
 * <p>
 * Input:
 * X = efgh, Y = jghi
 * Output: 6
 * Explanation: Shortest Common Supersequence
 * would be ejfghi which is of length 6 and
 * has both the strings as its subsequences.
 **/
public class ShortestCommonSupersequence13112023 {
    public void shortestCommonSupersequence() {

        String str1 = "abcd";
        String str2 = "xycd";

        int m = str1.length(), n = str2.length();

        int[][] arr = new int[m + 1][n + 1];
        for (int i = m; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                if (i == m || j == n) arr[i][j] = 0;
                else if (str1.charAt(i) == str2.charAt(j)) arr[i][j] = arr[i + 1][j + 1] + 1;
                else arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
        int common = arr[0][0];
        System.out.println("==>> Minimum length supersequence is :" + (n + m - common));
    }
}
