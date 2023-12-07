package com.mnj.java_solutions.binarysearch

class FloorOfNumber {
    //Floor of a number is greatest integer that is smaller than or equal to given number

    fun floorOfNumber() {
        val arr = intArrayOf(1, 2, 3, 5, 7, 9, 11, 15, 16)
        val num = 12

        var low = 0
        var high = arr.size - 1
        var result = 0

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (arr[mid] <= num) {
                result = arr[mid]
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        println("==>> Floor of number is: $result")
    }
}