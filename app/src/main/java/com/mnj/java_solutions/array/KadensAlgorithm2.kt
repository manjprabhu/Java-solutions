package com.mnj.java_solutions.array

/**
 * Given an integer array, find the subArray with the largest sum, and return its sum.
 * Print the start and end position of the array
 */
class KadensAlgorithm2 {
    fun maxSubArray() {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        val nums = intArrayOf(5, 4, -1, 7, 8)
        var currSum = 0
        var maxSum = Int.MIN_VALUE
        var start = 0
        var end = 0
        val s = 0 //temp start position
        for (i in nums.indices) {
            currSum += nums[i]
            if (currSum < 0) {
                currSum = 0
                start = i + 1
            }
            if (currSum > maxSum) {
                maxSum = currSum
                //                start = s;
                end = i
            }
        }
        println("==>> Max sum of subarray :$maxSum")
        println("==>> Array is from :$start to $end")
    }
}