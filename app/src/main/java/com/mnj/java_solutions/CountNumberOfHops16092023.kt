package com.mnj.java_solutions

/**
 * A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top of Nth step. As the answer will be large find the answer modulo 1000000007.
 *
 *
 * Example 1:
 *
 *
 * Input:
 * N = 1
 * Output: 1
 * Example 2:
 *
 *
 * Input:
 * N = 4
 * Output: 7
 * Explanation:Below are the 7 ways to reach
 * 4
 * 1 step + 1 step + 1 step + 1 step
 * 1 step + 2 step + 1 step
 * 2 step + 1 step + 1 step
 * 1 step + 1 step + 2 step
 * 2 step + 2 step
 * 3 step + 1 step
 * 1 step + 3 step
 */
class CountNumberOfHops16092023 {
    fun countWays() {
        val n = 5
        if (n == 1) {
            println("==>> Number of steps  is :" + 1)
            return
        }
        if (n == 2) {
            println("==>> Number of steps  is :" + 2)
            return
        }
        if (n == 3) {
            println("==>> Number of steps  is :" + 4)
            return
        }
        var a: Long = 1
        var b: Long = 2
        var c: Long = 4
        var ans: Long = 0
        for (i in 4..n) {
            ans = (a + b + c) % 1000000007
            a = b
            b = c
            c = ans
        }
        println("==>> Number of steps  is :$ans")
    }
}