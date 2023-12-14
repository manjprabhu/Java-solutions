package com.mnj.java_solutions

/**
 * Given a fence with n posts and k colors, find out the number of ways of painting the fence so that not more than two consecutive posts have the same colors. Since the answer can be large return it modulo 109 + 7.

Example 1:

Input:
n = 3
k = 2
Output: 6
Explanation:
We have following possible combinations:

 **/
class PaintingFence14122023 {

    fun countWays() {
        val n = 3
        val k: Long = 2
        val mod: Long = 1000000007
        var same: Long = 0
        var diff: Long = k
        var total = same + diff

        for (i in 2..n) {
            same = diff
            diff = total * (k - 1) % mod
            total = (same + diff) % mod
        }
        println("==>> Number of ways $total")
    }
}