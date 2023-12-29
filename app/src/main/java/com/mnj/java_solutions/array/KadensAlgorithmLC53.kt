package com.mnj.java_solutions.array

/**
 * Given an integer array, find the subArray
 * with the largest sum, and return its sum.
 */
class KadensAlgorithmLC53 {
    fun maxSubArray() {
        val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        var currSum = 0
        var maxSum = Int.MIN_VALUE
        for (i in nums) {
            currSum += i
            maxSum = Math.max(currSum, maxSum)
            if (currSum < 0) currSum = 0
        }
        println("==>> Max sum of subarray :$maxSum")
    }
}