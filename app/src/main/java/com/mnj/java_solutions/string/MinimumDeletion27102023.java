package com.mnj.java_solutions.string;

/**
 * Given a string of S as input. Your task is to write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome.
 * Note: The order of characters in the string should be maintained.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "aebcbda"
 * Output:
 * 2
 * Explanation:
 * Remove characters 'e' and 'd'.
 **/
public class MinimumDeletion27102023 {

    public void minNumberOfDeletion() {
        String S = "aebcbda";
        int n = S.length();
        int arr[][] = new int[n + 1][n + 1];
        StringBuilder s = new StringBuilder(S);
        s.reverse();

        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                if (i == n || j == n) arr[i][j] = 0;
                else if (S.charAt(i) == s.charAt(j)) arr[i][j] = 1 + arr[i + 1][j + 1];
                else arr[i][j] = Math.max(arr[i][j + 1], arr[i + 1][j]);
            }
        }
        System.out.println("==>> minimum number of deletion is  :" + (n - arr[0][0]));
    }
}
