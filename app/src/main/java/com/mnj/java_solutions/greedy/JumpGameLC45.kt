package com.mnj.java_solutions.greedy

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 *
 *
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 */
class JumpGameLC45 {
    fun jump() {
        val nums = intArrayOf(2, 3, 1, 1, 4)
        var current = 0
        var farthest = 0
        var jumps = 0
        for (i in 0 until nums.size - 1) {
            farthest = Math.max(
                farthest,
                i + nums[i]
            ) // calculate the farthest jump we can make at any index
            if (i == current) {
                current = farthest
                jumps++
            }
        }
        println("==>> Minimum number of jumps to reach the last  :$jumps")
    }
}