package com.mnj.java_solutions

class ReverseAnArray {
    fun reverseAnArray() {
        val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 9, 11)
        var i = 0
        var j = a.size - 1
        while (i <= j) {
            val temp = a[i]
            a[i] = a[j]
            a[j] = temp
            i++
            j--
        }
        for (k in a) println("==>> Re arranged array is :$k")
    }
}