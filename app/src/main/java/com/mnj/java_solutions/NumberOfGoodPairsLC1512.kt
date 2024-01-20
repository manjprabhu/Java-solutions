package com.mnj.java_solutions

/**
 * iven an array of integers nums, return the number of good pairs.
 *
 *
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * Example 2:
 *
 *
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * Example 3:
 *
 *
 * Input: nums = [1,2,3]
 * Output: 0
 */
class NumberOfGoodPairsLC1512 {
    fun numIdenticalPairs() {
        val nums = intArrayOf(1, 2, 3, 1, 1, 3)
        val count = IntArray(102)
        for (num in nums) {
            count[num]++
        }
        var totalCount = 0

        // Calculate total number of pairs possible
        for (i in count) {
            totalCount += i * (i - 1) / 2
        }
        println("==> total number of pairs are ..$totalCount")
    }
}
