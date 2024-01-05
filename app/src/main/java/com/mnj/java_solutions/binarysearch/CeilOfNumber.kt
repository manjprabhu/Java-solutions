package com.mnj.java_solutions.binarysearch

class CeilOfNumber {

    //LowerBound of a number and ceil of number are both has same solution
    // Ceil of a number is least integer number that is greater
    // than the given number (i.e num = 8 in this case)

    fun ceilOfNumber() {
        val arr = intArrayOf(1, 2, 7, 9, 11, 13, 25, 79)
        val num = 8
        var ans = 0
        var low = 0
        var high = arr.size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (arr[mid] >= num) {
                ans = arr[mid]
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        println("==>> Ceil of number is: $ans")
    }
}