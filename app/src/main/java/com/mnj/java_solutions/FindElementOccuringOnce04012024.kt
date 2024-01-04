package com.mnj.java_solutions

/**
 * Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
Find that element which occurs once.

Example 1:

Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
Example 2:

Input:
N = 10
arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
Output:
3
Explanation:
All elements except 3 occurs thrice in the array.
 **/
class FindElementOccuringOnce04012024 {

    fun singleElement(arr: IntArray, N: Int): Int {
        var res = 0
        for (i in 0..31) {
            var setbit = 0
            for (j in 0 until N) {
                if (arr[j] and (1 shl i) != 0) setbit++
            }
            if (setbit % 3 == 1) {
                res = res or (1 shl i)
            }
        }
        return res
    }
}