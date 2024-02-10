package com.mnj.java_solutions.twopointer

/**
 * Given an array of integers nums and an integer k,
 * return the number of unique k-diff pairs in the array.
 *
 *
 * A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
 *
 *
 * 0 <= i, j < nums.length
 * i != j
 * |nums[i] - nums[j]| == k
 */
class KDiffPairsInArrayLC532 {
    fun findPairs() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 2
        val map = HashMap<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        var count = 0
        for ((key, value) in map) {
            if (map.containsKey(key + k) && k != 0 || k == 0 && value > 1) count++
        }
        println("==>> Number of Pairs :$count")
    }
}
