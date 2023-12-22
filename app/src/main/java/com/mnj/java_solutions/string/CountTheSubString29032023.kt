package com.mnj.java_solutions.string

/**
 * Given a string S. The task is to count the number of substrings which contains equal number of lowercase and uppercase letters.
 *
 *
 * Example 1:
 *
 *
 * Input:
 * S = "gEEk"
 * Output: 3
 * Explanation: There are 3 substrings of
 * the given string which satisfy the
 * condition. They are "gE", "gEEk" and "Ek".
 * Example 2:
 *
 *
 * Input:
 * S = "WomensDAY"
 * Output: 4
 * Explanation: There are 4 substrings of
 * the given string which satisfy the
 * condition. They are "Wo", "ensDAY",
 * "nsDA" and "sD"
 */
class CountTheSubString29032023 {
    fun countSubstring() {
        val s = "WomensDAY"
        var cnt: Int
        var ans = 0
        for (i in 0 until s.length) {
            cnt = 0
            for (j in i until s.length) {
                if (s[j] >= 'a' && s[j] <= 'z') cnt++ else cnt--
                if (cnt == 0) ans++
            }
        }
        println("==>> Result is  :$ans")
    }
}