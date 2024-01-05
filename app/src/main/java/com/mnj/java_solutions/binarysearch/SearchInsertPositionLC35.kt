package com.mnj.java_solutions.binarysearch

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 *
 *
 * If not, return the index where it would be if it were inserted in order.
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
class SearchInsertPositionLC35 {

    fun searchInsertPositionInArray() {
        val a = intArrayOf(1, 3, 5, 7)
        val target = 4
        var low = 0
        var high = a.size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (a[mid] == target) {
                println("==>> Element is found at :$mid")
                return
            } else if (target > a[mid]) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        println("==>> Position to insert at :$low")
    }
}