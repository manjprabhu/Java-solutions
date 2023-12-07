package com.mnj.java_solutions.binarysearch

class KthMissingPositiveNumber {
    /**
     * Input: arr = [2,3,4,7,11], k = 5
     * Output: 9
     * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...].
     * The 5th missing positive integer is 9.
     *
     *
     * Input: arr = [1,2,3,4], k = 2
     * Output: 6
     * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
     */

    //The main idea is to shift k by 1 step if the current element is smaller or equal to k.
    // And whenever we get a number > k, we can conclude that k is the missing number.
    
    fun findKthPositive() {
        val arr = intArrayOf(1, 2, 3, 4)
        var k = 2
        for (j in arr) {
            if (j <= k)
                k++
            else
                break
        }
        println("==>> Kth missing element is :$k")
    }

    fun findKthPositive2() {
        val arr = intArrayOf(1,32, 59, 77)
        val k = 2
        var low = 0
        var high = arr.size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2
            val missing = arr[mid] - (mid + 1)
            if (missing < k) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        println("==>> Kth missing positive element is :" + (k + high + 1))
    }
}