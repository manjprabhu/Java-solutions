package com.mnj.java_solutions.array

/**
 * You are given a 0-indexed integer array nums of even length consisting of an EQUAL number of positive and negative integers.
 *
 *
 * You should rearrange the elements of nums such that the modified array follows the given conditions:
 *
 *
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 *
 *
 * Input: nums = [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 * Explanation:
 * The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
 * The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
 * Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
 */
class RearrangeArrayElementsBySignLC2149 {
    fun rearrangeArray() {
        val nums = intArrayOf(3, 1, -2, -5, 2, -4)
        val pos = IntArray(nums.size / 2)
        val neg = IntArray(nums.size / 2)
        var p = 0
        var n = 0
        for (num in nums) {
            if (num > 0) pos[p++] = num
            else neg[n++] = num
        }

        var i = 0
        var j = 0
        var index = 0

        while (i < pos.size && j < neg.size) {
            nums[index++] = pos[i]
            i++
            nums[index++] = neg[j]
            j++
        }
        for (x in nums) println("==>> $x")
    }

    fun rearrangeArray2() {
        val nums = intArrayOf(3, 1, -2, -5, 2, -4)
        var posIndex = 0
        var negIndex = 1

        val result = IntArray(nums.size)

        for (num in nums) {
            if (num < 0) {
                result[negIndex] = num
                negIndex += 2
            } else {
                result[posIndex] = num
                posIndex += 2
            }
        }

        for (x in result) println("==>> : $x")
    }
}
