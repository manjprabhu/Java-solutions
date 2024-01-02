package com.mnj.java_solutions.slidingwindow

/**
 *
 * Given an array a of length n and a number k, find the largest sum of the subarray containing at least k numbers. It is guaranteed that the size of array is at-least k.

Example 1:

Input :
n = 4
a[] = {1, -2, 2, -3}
k = 2
Output :
1
Explanation :
The sub-array of length at-least 2
that produces greatest sum is {1, -2}
Example 2:
Input :
n = 6
a[] = {1, 1, 1, 1, 1, 1}
k = 2
Output :
6
Explanation :
The sub-array of length at-least 2
that produces greatest sum is {1, 1, 1, 1, 1, 1}

 **/
class LargestSumSubArrayOfSizeAtLeastK02012023 {
    fun maxSumWithK(a: LongArray, n: Long, k: Long) {
        var currSum: Long = 0
        var maxSum: Long = 0
        var prv: Long = 0
        var i = 0
        var j = 0
        while (i < k) currSum += a[i++]
        maxSum = currSum
        while (i < n) {
            currSum += a[i++]
            prv += a[j++]
            maxSum = currSum.coerceAtLeast(maxSum)
            if (prv < 0) {
                currSum -= prv
                prv = 0
                maxSum = currSum.coerceAtLeast(maxSum)
            }
        }
        println("==>> Maximum sum is $maxSum")
    }
}