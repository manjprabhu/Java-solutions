package com.mnj.java_solutions.string

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 *
 * Example 1:
 *
 * Input: word = "USA"
 * Output: true
 * Example 2:
 *
 * Input: word = "FlaG"
 * Output: false
 */
class DetectTheCapitalLC520 {
    fun detectCapitalUse() {
        val str = "USAn"
        if (Character.isUpperCase(str[0])) {
            if (Character.isUpperCase(str[1])) {
                for (i in 2 until str.length) {
                    if (Character.isLowerCase(str[i])) {
                        println("==>> False")
                        return
                    }
                }
            } else {
                for (i in 2 until str.length) {
                    if (Character.isUpperCase(str[i])) {
                        println("==>> False")
                        return
                    }
                }
            }
        } else {
            for (element in str) {
                if (Character.isUpperCase(element)) {
                    println("==>> False")
                    return
                }
            }
        }
        println("==>> True")
    }
}