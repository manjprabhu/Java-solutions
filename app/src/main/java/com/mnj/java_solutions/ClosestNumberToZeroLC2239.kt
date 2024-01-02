package com.mnj.java_solutions

class ClosestNumberToZeroLC2239 {
    /*    Given an integer array nums of size n, return the number with the value closest to 0 in nums.
      If there are multiple answers, return the number with the largest value.*/
    fun closestNumberToZero() {
        val a = intArrayOf(-4, -2, 1, 4, 8)
        var max = Int.MAX_VALUE
        var closestNum = 0
        for (i in a) {
            if (Math.abs(i) < max) {
                max = Math.abs(i)
                closestNum = i
            } else if (Math.abs(i) == max && i < closestNum) {
                closestNum = i
            }
        }
        println("==>> Number closest to zero is:$closestNum")
    }
}