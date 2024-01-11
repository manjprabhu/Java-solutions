package com.mnj.java_solutions

import java.lang.StringBuilder
import java.util.*

/**
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
 *
 *
 * Return the sorted string. If there are multiple answers, return any of them.
 *
 *
 * Example 1:
 *
 *
 * Input: s = "tree"
 * Output: "eert"
 * Explanation: 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 *
 *
 * Input: s = "cccaaa"
 * Output: "aaaccc"
 * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 */
class SortCharactersByFrequencyLC451 {
    fun frequencySort() {
        val s = "cccaaabbnm"
        val map = HashMap<Char, Int>()
        for (element in s) {
            val c = element
            map[c] = map.getOrDefault(c, 0) + 1
        }
        val chars: List<Char> = ArrayList(map.keys)
        Collections.sort(chars) { a: Char, b: Char -> map[b]!! - map[a]!! }
        val result = StringBuilder()
        for (c in chars) {
            for (i in 0 until map[c]!!) {
                result.append(c)
            }
        }
        println("==>> result String is :$result")
    }
}