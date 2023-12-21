package com.mnj.java_solutions.array

/**
 * Given an array A[] of N positive integers.
 * The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
 */
class MaximumIndex {
    fun maximumIndex() {
        val arr = intArrayOf(34, 8, 10, 3, 2, 80, 30, 33, 1)
        var max = Int.MIN_VALUE
        for (i in arr.indices) {
            var length = 0
            for (j in i + 1 until arr.size) {
                if (arr[j] > arr[i]) length = j - i
            }
            max = Math.max(max, length)
        }
        println("==>> maximum index is  :$max")
    }
}