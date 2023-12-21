package com.mnj.java_solutions

/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 *
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 *
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 *
 * Example 1:
 *
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 *
 * Input: s = "abcde", goal = "abced"
 * Output: false
 */
class RotateStringLC796 {
    fun rotateString() {
        val s = "abcde"
        val goal = "bcdea"
        val result = s.length == goal.length && (s + s).contains(goal)
        if (result) {
            println("==>> True")
        } else println("==>> false")
    }
}