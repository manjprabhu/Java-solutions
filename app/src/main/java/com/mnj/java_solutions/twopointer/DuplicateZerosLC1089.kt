package com.mnj.java_solutions.twopointer

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 *
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 *
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
class DuplicateZerosLC1089 {
    fun duplicateZeros() {
        val arr = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        val len = arr.size
        if (len == 1) return
        var start = 0
        var end = len - 1
        while (start < end) {
            if (arr[start] == 0) end--
            start++
        }
        if (end == len - 1) return
        var i = len - 1
        while (i >= 0 && end >= 0) {
            arr[i] = arr[end]
            if (arr[end] == 0 && end != start) {
                arr[i - 1] = 0
                i--
            }
            i--
            end--
        }
        for (num in arr) {
            println("==>> Result is :$num")
        }
    }
}