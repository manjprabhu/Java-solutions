package com.mnj.java_solutions.twopointer

/**
 * Given a string s, reverse the string according to the following rules:
 *
 *
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: s = "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 *
 *
 * Input: s = "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 */
class ReverseOnlyLettersLC917 {
    fun reverseOnlyLetters() {
        val s = "ab-cd"
        val array = s.toCharArray()
        var i = 0
        var j = array.size - 1
        while (i <= j) {
            if (Character.isAlphabetic(array[i].toInt()) && Character.isAlphabetic(
                    array[j].toInt()
                )
            ) {
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
                i++
                j--
            } else if (!Character.isAlphabetic(array[i].toInt())) {
                i++
            } else if (!Character.isAlphabetic(array[j].toInt())) {
                j--
            }
        }
        println("==>> Result string is  :" + String(array))
    }
}