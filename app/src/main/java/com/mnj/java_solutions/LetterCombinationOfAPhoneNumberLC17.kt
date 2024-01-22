package com.mnj.java_solutions

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 *
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 *
 *
 *
 * Input: digits = "2"
 * Output: ["a","b","c"]
 */
class LetterCombinationOfAPhoneNumberLC17 {
    private val keypad = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    fun letterCombinations() {
        val s = "23"
        possibleWords(s, "")
    }

    private fun possibleWords(s: String, result: String) {
        if (s.length == 0) {
            println("==>>> Result is :$result")
            return
        }
        val key = keypad[s[0].code - 48]
        for (i in 0 until key.length) {
            possibleWords(s.substring(1), result + key[i])
        }
    }
}
