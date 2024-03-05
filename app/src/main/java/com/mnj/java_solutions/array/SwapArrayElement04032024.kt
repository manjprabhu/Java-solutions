package com.mnj.java_solutions.array

/**
 * Given an array arr of n positive integers. The task is to swap every ith element of the array with (i+2)th element.
 *
 * Example 1:
 *
 * Input:
 * n = 3
 * arr[] = 1 2 3
 * Output:
 * 3 2 1
 * Explanation:
 * Swapping 1 and 3, makes the array 3 2 1. There is only one swap possible in this array.
 * Example 2:
 *
 * Input:
 * n = 5
 * arr[] = 1 2 3 4 5
 * Output:
 * 3 4 5 2 1
 * Explanation:
 * Swapping 1 and 3, makes the array 3 2 1 4 5.
 * Now, swapping 2 and 4, makes the array 3 4 1 2 5.
 * Again,swapping 1 and 5, makes the array 3 4 5 2 1.**/
class SwapArrayElement04032024 {

    fun swapElement() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        var i = 0;
        while (i + 2 < arr.size) {
            val temp = arr[i]
            arr[i] = arr[i + 2]
            arr[i + 2] = temp
            i++
        }

        for(i in arr)
            println("==>> $i")
    }
}