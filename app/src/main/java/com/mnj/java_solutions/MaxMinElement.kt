package com.mnj.java_solutions

class MaxMinElement {
    fun maxMinElement() {
        println("==>> Maximum element is :" + maxElement())
        println("==>> Minimum element is : " + minElement())
    }

    private fun maxElement(): Int {
        val a = intArrayOf(1, -3, 8, 9, 2, 13)
        var max = Int.MIN_VALUE
        for (j in a) {
            if (j > max) max = j
        }
        return max
    }

    private fun minElement(): Int {
        val a = intArrayOf(1, -3, 8, 9, 2, 3)
        var min = Int.MAX_VALUE
        for (j in a) {
            if (j < min) min = j
        }
        return min
    }
}