package com.mnj.java_solutions.array

class MinimumDistance02112023 {
    fun minDist() {
        // code here
        val a = intArrayOf(1, 2, 3, 2)
        val n = a.size
        val x = 1
        val y = 2
        var dist = 1e9.toInt()
        var xi = 0
        var yi = 0
        var f1 = false
        var f2 = false
        for (i in 0 until n) {
            if (a[i] == x) {
                f1 = true
                xi = i
            } else if (a[i] == y) {
                f2 = true
                yi = i
            }
            if (f1 && f2) dist = Math.min(abs(xi, yi), dist)
        }
        if (f1 && f2) println("Minimum distance is \$dist") else println("Minimum distance is -1")
    }

    fun abs(a: Int, b: Int): Int {
        return if (a > b) a - b else b - a
    }
}