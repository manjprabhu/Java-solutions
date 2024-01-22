package com.mnj.java_solutions

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 *
 * Return the merged string.
 *
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 */
class MergeStringAlternativelyLC1768 {
    fun mergeAlternately(): String {
        val word1 = "abc"
        val word2 = "pqr"
        val sb = StringBuilder()
        val length = word1.length + word2.length
        var firstIndex = 0
        var secondIndex = 0
        for (i in 0 until length) {
            if (i % 2 == 0) {
                if (firstIndex < word1.length) sb.append(word1[firstIndex++]) else sb.append(word2[secondIndex++])
            } else {
                if (secondIndex < word2.length) sb.append(word2[secondIndex++]) else sb.append(word1[firstIndex++])
            }
        }
        return sb.toString()
    }
}
