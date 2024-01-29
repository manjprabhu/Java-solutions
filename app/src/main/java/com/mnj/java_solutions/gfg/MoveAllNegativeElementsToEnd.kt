package com.mnj.java_solutions.gfg

import java.util.Arrays

/**
 * Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
 *
 *
 *
 * Example 1:
 *
 * Input :
 * N = 8
 * arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 * Output :
 * 1  3  2  11  6  -1  -7  -5
 */
class MoveAllNegativeElementsToEnd {
    //Order is not maintained here
    fun segregateElements() {
        val arr = intArrayOf(-1, 2, -3, 4, 5, 6, -7, 8, 9)
        Arrays.sort(arr)
        var i = 0
        var j = arr.size - 1
        while (i < j) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            i++
            j--
        }
        for (num in arr) println("==>> Array with segregated elements is :$num")
    }

    //Two pointer approach
    fun segregateElements2() {
        val arr = intArrayOf(1, -1, 3, 2, -7, -5, 11, 6)
        val result = IntArray(arr.size)
        var j = 0
        for (value in arr) {
            if (value >= 0) result[j++] = value
        }
        for (k in arr) {
            if (k < 0) result[j++] = k
        }
        println("==>> **************  2 Array with segregated Elements is ****************")
        for (num in result) println("==>> $num")
    }
}
