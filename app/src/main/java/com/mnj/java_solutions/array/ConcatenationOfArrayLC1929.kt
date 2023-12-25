package com.mnj.java_solutions.array

class ConcatenationOfArrayLC1929 {
    fun concat() {
        val nums = intArrayOf(1, 2, 3)
        val res = IntArray(2 * nums.size)
        for (i in nums.indices) {
            res[i] = nums[i]
            res[i + nums.size] = nums[i]
        }
        for (i in res) {
            println("==>> :$i")
        }
    }
}