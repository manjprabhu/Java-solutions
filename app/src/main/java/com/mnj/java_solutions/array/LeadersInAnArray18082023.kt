package com.mnj.java_solutions.array

import java.util.Collections

/**
 * Given an array, print all the elements which are leaders.
 * A Leader is an element that is greater than all of the elements on its right side in the array.
 */
class LeadersInAnArray18082023 {
    fun leadersInAnArray() {
        val arr = intArrayOf(10, 22, 12, 3, 0, 6)
        val result = ArrayList<Int>()
        for (i in arr.indices) {
            var isLeader = true
            for (j in i + 1 until arr.size) {
                if (arr[j] > arr[i]) {
                    isLeader = false
                    break
                }
            }
            if (isLeader) result.add(arr[i])
        }
        for (i in result.indices) println("==>> Leaders in array are :" + result[i])
    }

    fun leadersInAnArray2() {
        val arr = intArrayOf(16, 17, 4, 3, 5, 2)
        val result = ArrayList<Int?>()
        result.add(arr[arr.size - 1])
        var greatest = arr[arr.size - 1]
        for (i in arr.size - 2 downTo 0) {
            if (arr[i] > greatest) {
                result.add(arr[i])
                greatest = arr[i]
            }
        }
        Collections.reverse(result)
        for (i in result.indices) println("==>> Leaders in Array are :" + result[i])
    }
}
