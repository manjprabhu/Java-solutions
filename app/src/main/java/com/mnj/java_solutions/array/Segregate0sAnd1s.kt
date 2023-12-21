package com.mnj.java_solutions.array

/**
 * Given an array of 0s and 1s in random order.
 * Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array].
 * Traverse array only once.
 */
class Segregate0sAnd1s {
    fun segregate() {
        val arr = intArrayOf(0, 1, 0, 0, 1, 1, 0)
        var low = 0
        var high = arr.size - 1
        while (low < high) {
            while (arr[low] == 0 && low < high) {
                low++
            }
            while (arr[high] == 1 && low < high) {
                high--
            }
            if (low < high) {
                arr[low] = 0
                arr[high] = 1
                low++
                high--
            }
        }
        println("==>> **************  Segregated array ***************")
        for (j in arr) {
            println("==>> $j")
        }
    }
}