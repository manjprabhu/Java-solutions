package com.mnj.java_solutions.twopointer

class TwoSumSortedArray {
    fun twoSumPair() {
        val num = intArrayOf(2, 3, 4)
        val target = 6
        var i = 0
        var j = num.size - 1
        while (i < j) {
            if (num[i] + num[j] == target) {
                println("==>> pair is :${num[i]} , ${num[j]}")
                i++
                j--
            } else if (num[i] + num[j] < target) {
                i++
            } else {
                j--
            }
        }
    }
}