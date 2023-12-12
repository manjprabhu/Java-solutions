package com.mnj.java_solutions

/***
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *
 * typically using all the original letters exactly once.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
class ValidAnagramLC242 {
    //Fill the bucket array

    //Empty the bucket array
    val isValidAnagram: Unit
        get() {
            val st1 = "anagram"
            val st2 = "nagaramm"
            if (st1.length != st2.length) {
                println("==>> False")
                return
            }
            val char_counts = IntArray(26)

            //Fill the bucket array
            for (i in 0 until st1.length) {
                char_counts[st1[i] - 'a']++
            }

            //Empty the bucket array
            for (i in 0 until st2.length) {
                char_counts[st2[i] - 'a']--
            }
            for (count in char_counts) {
                if (count != 0) {
                    println("==>> False")
                }
            }
            println("==>> True")
        }
}