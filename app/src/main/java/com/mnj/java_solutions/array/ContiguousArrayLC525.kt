package com.mnj.java_solutions.array

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 */
class ContiguousArrayLC525 {
    fun findMaxLength() {
        val arr = intArrayOf(0, 1, 0)
        var max = Int.MIN_VALUE
        val map = HashMap<Int, Int>()
        var prefixSum = 0
        for (i in arr.indices) {

            //If current element is 1 then add that 1 to current sum else if current element is zero subtract 1 from prefix sum
            // when prefix sum is zero then , there is exists a subarray with equal number of 0's and 1's. ( here we are assuming 0 as -1)
            prefixSum = if (arr[i] == 1) prefixSum + arr[i] else prefixSum - 1
            if (prefixSum == 0) {
                max = Math.max(max, i + 1)
            }

            //Calculate the length and update max length
            if (map.containsKey(prefixSum)) {
                val len = i - map[prefixSum]!!
                max = Math.max(max, len)
            }

            //Finally, update the map checking the conditions:
            if (!map.containsKey(prefixSum)) {
                map[prefixSum] = i
            }
        }
        println("==>>> Length of maximum subarray that contains equal number of 0's and 1's is :$max")
    }
}
