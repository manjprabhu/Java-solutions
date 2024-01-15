package com.mnj.java_solutions

import java.util.*
/**
 * Given a string s, find the longest palindromic subsequence's length in s.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".
Example 2:

Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".

 **/
class LongestPalindromicSubsequenceLC516 {

    fun longestPalindromeSubseq(s: String): Int {
        val str = StringBuilder(s)
        val s2 = str.reverse().toString()
        val n = s.length
        var prev = IntArray(n + 1)
        val cur = IntArray(n + 1)
        for (i in 1..n) {
            for (j in 1..n) {
                if (s[i - 1] == s2[j - 1]) {
                    cur[j] = 1 + prev[j - 1]
                } else cur[j] = cur[j - 1].coerceAtLeast(prev[j])
            }
            prev = cur.copyOf(n + 1)
        }
        return cur[n]
    }
}