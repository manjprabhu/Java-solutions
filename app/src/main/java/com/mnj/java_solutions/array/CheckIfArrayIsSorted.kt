package com.mnj.java_solutions.array

class CheckIfArrayIsSorted {
    val isSortedArray: Unit
        get() {
            val arr = intArrayOf(1, 2, 3, 4, 5, 2)
            val n = arr.size
            for (i in 1 until n) {
                if (arr[i] < arr[i - 1]) {
                    println("==>> Array is NOT sorted...")
                    return
                }
            }
            println("==>> Array is  sorted...")
        }
}