package com.mnj.java_solutions.array

/***
 *
 * Given an array Arr of size N containing positive integers. Find the maximum sum of a any possible subsequence such that no two numbers in the subsequence should be adjacent in Arr.

Example 1:

Input:
N = 6
Arr[] = {5, 5, 10, 100, 10, 5}
Output: 110
Explanation: If you take indices 0, 3
and 5, then Arr[0]+Arr[3]+Arr[5] =
5+100+5 = 110.

 **/
class MaxSumWithoutAdjacents17122023 {

    fun findMaxSum() {
        val array = intArrayOf(5, 5, 10, 100, 10, 5)
        val n = array.size

        if (n === 1) {
            println("==>>Maximum sum is ${array[0]}")
        }

        var i = 2
        var res = 0

        while (i < n) {
            array[i] = array[i] + array[i - 2]

            array[i - 1] = Math.max(array[i - 1], array[i - 2])

            res = Math.max(array[i], array[i - 1])
            i++
        }
        println("==>>Maximum sum is $res")
    }
}