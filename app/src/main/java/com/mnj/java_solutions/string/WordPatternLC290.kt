package com.mnj.java_solutions.string

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and
 * a non-empty word in s.
 *
 *
 * Example 1:
 *
 *
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Example 2:
 *
 *
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 *
 *
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */
class WordPatternLC290 {
    fun wordPattern() {
        val str = "dog cat cat dog"
        val pattern = "abba"
        val map = HashMap<Char, String>()
        val words = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        if (words.size != pattern.length) {
            println("==>> False")
            return
        }
        for (i in pattern.indices) {
            val current_char = pattern[i]
            if (map.containsKey(current_char)) {
                if (map[current_char] != words[i]) {
                    println("==>> False")
                    return
                }
            } else {
                if (map.containsValue(words[i])) {
                    println("==>> False")
                    return
                }
                map[current_char] = words[i]
            }
        }
    }
}
