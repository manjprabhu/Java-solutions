package com.mnj.java_solutions.string

import java.util.HashMap

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 *
 * If it does not exist, return -1.
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 */
class FirstUniqueCharacterInAStringLC387 {
    fun firstUniqueChar() {
        val str = "leetcode"
        val map = HashMap<Char, Int>()
        for (i in 0 until str.length) {
            val c = str[i]
            map[c] = map.getOrDefault(c, 0) + 1
        }
        for (i in 0 until str.length) {
            if (map.containsKey(str[i]) && map[str[i]] == 1) {
                println("==>> Index of first unique char is :$i")
                return
            }
        }
    }
}