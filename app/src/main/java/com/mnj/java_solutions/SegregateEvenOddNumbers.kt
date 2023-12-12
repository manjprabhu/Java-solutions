package com.mnj.java_solutions

class SegregateEvenOddNumbers {
    fun segregateEvenOddNumbers() {
        println("==>> Segregate numbers")
        val arr = intArrayOf(1, 9, 5, 3, 2, 6, 7, 11, 4)
        val n = arr.size
        var i = 0
        var j = 0
        while (j < n) {
            if (arr[j] % 2 == 0) {
                val temp = arr[j]
                arr[j] = arr[i]
                arr[i] = temp
                i++
            } else {
                j++
            }
        }
        for (k in arr) println("==>> New Array is:$k")
    }
}