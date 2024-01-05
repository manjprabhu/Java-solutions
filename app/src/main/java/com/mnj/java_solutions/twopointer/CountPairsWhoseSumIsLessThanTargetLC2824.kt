package com.mnj.java_solutions.twopointer

/**
 * Given a 0-indexed integer array nums of length n and an integer target,
 * return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 *
 * Example 1:
 *
 * Input: nums = [-1,1,2,3,1], target = 2
 * Output: 3
 * Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
 * - (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
 * - (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target
 * - (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
 * Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
 *
 * Solution
 *
 * the sum of the elements at left and right is less than the target value, it means all pairs with the current left element will also satisfy the condition. So, increment the count by right - left and move the left pointer to the right.
 * If the sum is greater than or equal to the target, move the right pointer to the left.
 */
class CountPairsWhoseSumIsLessThanTargetLC2824 {
    fun countPairs() {
        val nums = intArrayOf(-1, 1, 2, 3, 1)
        val target = 2
        var i = 0
        var j = nums.size - 1
        var count = 0
        while (i <= j) {
            if (nums[i] + nums[j] < target) {
                count += j - i
                i++
            } else {
                j--
            }
        }
        println("==>> Number of pairs less than target is :$count")
    }
}