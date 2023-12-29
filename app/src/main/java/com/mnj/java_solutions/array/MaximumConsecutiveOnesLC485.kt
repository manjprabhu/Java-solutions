package com.mnj.java_solutions.array

class MaximumConsecutiveOnesLC485 {
    fun findMaxConsecutiveOnes() {
        val nums = intArrayOf(1, 1, 0, 1, 1, 1)
        var countOnes = 0
        var j = 0
        val n = nums.size
        var maxLength = Int.MIN_VALUE
        while (j < n) {
            if (nums[j] == 1) {
                countOnes++
            } else if (nums[j] == 0) {
                countOnes = 0
            }
            j++
            maxLength = Math.max(maxLength, countOnes)
        }
        println("==>> Maximum consecutive ones: $maxLength")
    }
}