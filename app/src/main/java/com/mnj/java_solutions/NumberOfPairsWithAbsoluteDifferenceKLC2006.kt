package com.mnj.java_solutions

class NumberOfPairsWithAbsoluteDifferenceKLC2006 {
    fun findPairs() {
        val a = intArrayOf(1, 2, 2, 1)
        val k = 1
        var count = 0
        val arr = IntArray(201)
        for (j in a) {
            arr[j]++
        }
        for (i in k + 1 until arr.size) {
            count = count + arr[i] * arr[i - k]
        }
        println("==>> Number of pairs :$count")
    }
}