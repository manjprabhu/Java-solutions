package com.mnj.java_solutions

import java.util.*

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j,
 * i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 */
class ThreeSumLC15 {
    fun tripletsWithGivenSum() {
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val sum = 0
        Arrays.sort(nums)
        //after sorting {-4,-1,-1,0,1,2}
        for (i in 0 until nums.size - 2) {
            var min = i + 1
            var max = nums.size - 1
            while (min < max) {
                val currentSum = nums[i] + nums[min] + nums[max]
                if (currentSum == 0) {
                    println("==>> Triplet is: (" + nums[i] + "," + nums[min] + "," + nums[max] + ")")
                    min++
                    max--
                } else if (currentSum > 0) {
                    min++
                } else {
                    max--
                }
            }
        }
    }
}