package com.mnj.java_solutions

/**
 *
 * Given an array arr containing N integers and a positive integer K, find the length of the longest sub array with sum of the elements divisible by the given value K.

Example 1:

Input:
N = 6, K = 3
arr[] = {2, 7, 6, 1, 4, 5}
Output:
4
Explanation:
The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.
Example 2:

Input:
N = 7, K = 3
arr[] = {-2, 2, -5, 12, -11, -1, 7}
Output:
5
Explanation:
The subarray is {2,-5,12,-11,-1} with sum -3, which is divisible by 3.

 **/
class LongestSubArrayWithSumDivisibleByK10012024 {

    fun longestSubArrayWthSumDivByK() {

        val a = intArrayOf(2, 7, 6, 1, 4, 5)
        val k = 3
        val n = 6

        val hm: HashMap<Int, Int> = HashMap()
        hm[0] = -1
        var len = 0
        var max = 0
        var sum = 0
        for (i in 0 until n) {
            sum = (sum + a[i]) % k
            if (sum < 0)
                sum += k
            if (hm.containsKey(sum % k)) {
                len = i - hm[sum % k]!!
            } else hm[sum % k] = i
            if (len > max) max = len
        }
        println("==>> Lonngest subarray with sum divisble by K : $max")
    }
}