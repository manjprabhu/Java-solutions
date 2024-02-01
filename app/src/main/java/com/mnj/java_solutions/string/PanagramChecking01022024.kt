package com.mnj.java_solutions.string

import java.util.Locale

/***
 * Given a string s check if it is "Panagram" or not.
 *
 * A "Panagram" is a sentence containing every letter in the English Alphabet.
 *
 * Example 1:
 *
 * Input:
 * s = "Bawds jog, flick quartz, vex nymph"
 * Output:
 * 1
 * Explanation:
 * In the given input, there
 * are all the letters of the English
 * alphabet. Hence, the output is 1.
 * Example 2:
 *
 * Input:
 * s = "sdfs"
 * Output:
 * 0
 * Explanation:
 * In the given input, there
 * aren't all the letters present in the
 * English alphabet. Hence, the output
 * is 0.
 */
object PanagramChecking01022024 {
    fun isLetter(ch: Char): Boolean {
        return if (!Character.isLetter(ch)) false else true
    }

    fun allLetter(str: String, len: Int): Boolean {
        var str = str
        str = str.lowercase(Locale.getDefault())
        val present = BooleanArray(26)
        for (i in 0 until str.length) {
            if (isLetter(str[i])) {
                val letter = str[i].code - 'a'.code
                present[letter] = true
            }
        }
        for (i in 0..25) {
            if (!present[i]) return false
        }
        return true
    }
}
