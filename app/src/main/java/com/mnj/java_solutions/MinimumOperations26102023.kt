package com.mnj.java_solutions

/**
 * iven a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:
 *
 *
 * Double the number
 * Add one to the number
 * Example 1:
 *
 *
 * Input:
 * N = 8
 * Output: 4
 * Explanation:
 * 0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8.
 */
class MinimumOperations26102023 {
    fun minOperation() {
        var n = 8
        var step = 0
        while (n != 0) {
            n = if (n % 2 == 0) n / 2 else n - 1
            step++
        }
        println("==>> Number of steps :$step")
    }
}