package com.mnj.java_solutions.array

/**
 *
 * This problem is also the same as the famous “Dutch National Flag problem”.
 *
 *
 * Given an array nums with n objects colored red, white, or blue,
 *
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
class SortArrayOf0s1s2sLC75 {
    fun sort() {
        val arr = intArrayOf(1, 1, 0, 1, 2, 1, 0)
        var low = 0
        var mid = 0
        var high = arr.size - 1
        var temp: Int
        while (mid <= high) {
            when (arr[mid]) {
                0 -> {
                    temp = arr[low]
                    arr[low] = arr[mid]
                    arr[mid] = temp
                    low++
                    mid++
                }
                1 -> {
                    mid++
                }
                2 -> {
                    temp = arr[high]
                    arr[high] = arr[mid]
                    arr[mid] = temp
                    high--
                }
            }
        }
        for (n in arr) {
            println("==>> :$n")
        }
    }
}