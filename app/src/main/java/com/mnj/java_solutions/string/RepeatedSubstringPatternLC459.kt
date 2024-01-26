package com.mnj.java_solutions.string

/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 *
 *
 * Input: s = "aba"
 * Output: false
 * Example 3:
 *
 *
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 *
 * https://github.com/MAZHARMIK/Interview_DS_Algo/blob/master/strings/Repeated%20Substring%20Pattern.cpp
 */
class RepeatedSubstringPatternLC459 {
    fun repeatedSubstringPattern() {
        val str = "abab"
        val n = str.length

        //Maximum length of substring can be considered is n/2
        for (l in n / 2 downTo 1) {
            if (n % l == 0) { // if l is length of substring , if(n%l ==0) then only we can consider that length substring
                var times =
                    n / l // How many times substring needs to appended to make original string
                val pattern = str.substring(0, l) // take that substring
                val newStr = StringBuilder()
                while (times > 0) {
                    newStr.append(pattern) // keep on appending the substring to result string.
                    times--
                }
                if (str == newStr.toString()) {
                    println("==>> Repeated Substring....")
                }
            }
        }
        println("==>> NOT a Repeated Substring....")
    }
}
