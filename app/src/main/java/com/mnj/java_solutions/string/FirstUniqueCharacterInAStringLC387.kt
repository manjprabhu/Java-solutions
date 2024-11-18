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
        val str = "leetcodel"
        val map = HashMap<Char, Int>()
        for (element in str) {
            map[element] = map.getOrDefault(element, 0) + 1
        }
        for (i in str.indices) {
            if (map.containsKey(str[i]) && map[str[i]] == 1) {
                println("==>> Index of first unique char is :$i")
                return
            }
        }
    }
}