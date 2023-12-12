package com.mnj.java_solutions

class MoveZeroes {

    fun moveZerosToEnd() {
        val a = intArrayOf(0, 1, 5, 0, 12, 0, 9, 7, 11, 87)
        var insertPosition = 0
        for (i in a.indices) {
            if (a[i] != 0) {
                a[insertPosition] = a[i]
                insertPosition++
            }
        }
        while (insertPosition != a.size) {
            a[insertPosition++] = 0
        }
        for (j in a) {
            println("==>> New Array is :$j")
        }
    }
}