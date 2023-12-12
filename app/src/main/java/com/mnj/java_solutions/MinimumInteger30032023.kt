package com.mnj.java_solutions

/**
 * You are given an array A of size N. Let us denote S as the sum of all integers present in the array. Among all integers present in the array, find the minimum integer X such that S ≤ N*X.
 *
 *
 * Example 1:
 *
 *
 * Input:
 * N = 3,
 * A = { 1, 3, 2}
 * Output:
 * 2
 * Explanation:
 * Sum of integers in the array is 6.
 * since 6 ≤ 3*2, therefore 2 is the answer.
 * Example 2:
 *
 *
 * Input:
 * N = 1,
 * A = { 3 }
 * Output:
 * 3
 * Explanation:
 * 3 is the only possible answer
 */
class MinimumInteger30032023 {
    fun minimumInteger() {
        val arr = intArrayOf(1, 3, 2)
        val n = arr.size
        var sum: Long = 0
        for (j in arr) {
            sum += j.toLong()
        }
        var min = Int.MAX_VALUE.toLong()
        for (j in arr) {
            if (Math.log(sum.toDouble()) <= Math.log(n.toDouble()) + Math.log(j.toDouble())) {
                min = Math.min(min, j.toLong())
            }
        }
        println("==>> Minimum integer is  :" + min.toInt())
    }
}