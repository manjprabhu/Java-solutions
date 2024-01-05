package com.mnj.java_solutions.array

/**
 * Equilibrium Index
 *
 * Given a 0-indexed integer array nums, find the leftmost middleIndex
 * (i.e., the smallest amongst all the possible ones).
 *
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 *
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly,
 * if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 *
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 */
class MiddleIndexInAnArrayLC1991 {
    fun findMiddleIndex() {
        val nums = intArrayOf(2, 3, -1, 8, 4)
        var sum = 0
        var leftSum = 0

        for (j in nums) {
            sum += j
        }
        for (i in nums.indices) {
            sum -= nums[i]
            if (sum == leftSum) {
                println("==>> Middle index of the array is :$i")
            }
            leftSum += nums[i]
        }
        println("==>> No Middle index  array  :")
    }
}