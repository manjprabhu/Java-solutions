package com.mnj.java_solutions.string

/**
 * The power of the string is the maximum length of a non-empty substring that contains only one
 * unique character.
 *
 * Given a string s, return the power of s.
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
 */
class ConsecutiveCharactersLC1446 {
    fun maxPower() {
        val s = "abbcccddddeeeeedcba"
        var count = 1
        var max_count = 1
        var prev = s[0]
        for (i in 1 until s.length) {
            if (s[i] == prev) {
                count++
                max_count = maxOf(max_count,count)// max_count.coerceAtLeast(count)
            } else {
                count = 1
                prev = s[i]
            }
        }
        println("==>> Max count is :$max_count")
    }
}
