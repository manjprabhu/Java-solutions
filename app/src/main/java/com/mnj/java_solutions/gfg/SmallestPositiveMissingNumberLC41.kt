package com.mnj.java_solutions.gfg

/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 *
 * Example 2:
 *
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 *
 * Example 3:
 *
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 *
 */
class SmallestPositiveMissingNumberLC41 {
    fun missingNumberBruteForce() {
        val arr = intArrayOf(0, -10, 1, -3, 2)
        val n = 5
        val visit = BooleanArray(n + 1)
        for (j in arr) {
            if (j in 1..n) {
                println("==>> -----------------------------------")
                visit[j] = true
            }
        }
        for (i in 1 until visit.size) {
            println("==>> Visit : " + visit[i])
        }
        for (i in 1 until visit.size) {
            if (!visit[i]) {
                println("==>> Smallest missing +ve number is :$i")
                return
            }
        }
    }

    fun missingNumber() {
        val arr = intArrayOf(0, -10, 1, -3, 2)
        val n = 5
        for (i in arr.indices) {
            while (arr[i] in 1..n && arr[i] != arr[arr[i] - 1]) {
                val temp = arr[arr[i] - 1]
                arr[arr[i] - 1] = arr[i]
                arr[i] = temp
            }
        }
        for (i in 0 until n) {
            if (arr[i] != i + 1) {
                println("==>> Smallest missing element:" + (i + 1))
                return
            }
        }
        println("==>> Smallest missing element:" + (n + 1))
    }
}