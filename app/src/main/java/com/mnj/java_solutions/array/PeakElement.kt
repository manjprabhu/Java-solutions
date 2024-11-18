package com.mnj.java_solutions.array

class PeakElement {

    fun peakElement() {

        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 5, 1)

        for (i in arr.indices) {

            if ((i == 0 || arr[i - 1] < arr[i])
                && (i == arr.size - 1 || arr[i] > arr[i + 1])
            ) {
                println("Peak Element is ${arr[i]}")
            }
        }
    }
}