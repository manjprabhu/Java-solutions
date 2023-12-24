package com.mnj.java_solutions.string

import java.lang.StringBuilder

/**
 * Given a string of S as input. Your task is to write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome.
 * Note: The order of characters in the string should be maintained.
 *
 * Example 1:
 *
 * Input:
 * S = "aebcbda"
 * Output:
 * 2
 * Explanation:
 * Remove characters 'e' and 'd'.
 */
class MinimumDeletion27102023 {
    fun minNumberOfDeletion() {
        val S = "aebcbda"
        val n = S.length
        val arr = Array(n + 1) { IntArray(n + 1) }
        val s = StringBuilder(S)
        s.reverse()
        for (i in n downTo 0) {
            for (j in n downTo 0) {
                if (i == n || j == n) arr[i][j] = 0 else if (S[i] == s[j]) arr[i][j] =
                    1 + arr[i + 1][j + 1] else arr[i][j] = Math.max(
                    arr[i][j + 1], arr[i + 1][j]
                )
            }
        }
        println("==>> minimum number of deletion is  :" + (n - arr[0][0]))
    }
}