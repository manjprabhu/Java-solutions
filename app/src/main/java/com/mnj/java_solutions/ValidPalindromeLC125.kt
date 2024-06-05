package com.mnj.java_solutions

import java.util.Locale

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 *
 *
 * removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */
class ValidPalindromeLC125 {
    val isValidPalindrome: Unit
        /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.*/
        get() {
            val str = "A man, a plan, a canal: Panama"
            var fixed_String = ""

            //remove the spaces and non alphanumeric chars.
            for (c in str.toCharArray()) {
                if (Character.isDigit(c) || Character.isLetter(c)) {
                    fixed_String += c
                }
            }
            var start = 0
            var end = fixed_String.length - 1
            fixed_String =
                fixed_String.lowercase(Locale.getDefault()) // convert the string to lowercase
            while (start <= end) {
                if (fixed_String[start] != fixed_String[end]) {
                    println("==>> String is NOT palindrome")
                    return
                } else {
                    start++
                    end--
                }
            }
            println("==>> String is Palindrome")
        }
}
