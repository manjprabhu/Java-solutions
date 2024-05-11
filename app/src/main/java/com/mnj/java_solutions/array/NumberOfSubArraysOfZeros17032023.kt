package com.mnj.java_solutions.array

/**
 * You are given an array arr  of length N of 0's and 1's. Find the total number of subarrays of 0's
 *
 *
 * Example 1:
 *
 *
 * Input:
 * N = 4
 * arr[] = {0, 0, 1, 0}
 * Output:
 * 4
 * Explanation:
 * Following are the subarrays of
 * length 1: {0}, {0}, {0} - 3
 * length 2: {0, 0} - 1
 * Total Subarrays: 3 + 1 = 4
 */
class NumberOfSubArraysOfZeros17032023 {
    fun noOfSubarrays() {
        val arr = intArrayOf(0, 0, 1, 0)
        val N = arr.size
        var ans: Long = 0
        var cnt: Long = 0
        for (j in arr) {
            if (j == 0) cnt++ else {
                ans += (cnt + 1) * cnt / 2
                cnt = 0
            }
        }
        ans += (cnt + 1) * cnt / 2
        println("==>> Number of subarrays of 0's :$ans")
    }
}
