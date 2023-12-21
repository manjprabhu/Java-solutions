package com.mnj.java_solutions.array

class WaveArray28092023 {
    fun convertToWave() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val n = arr.size
        var i = 1
        while (i < n) {
            val c = arr[i]
            arr[i] = arr[i - 1]
            arr[i - 1] = c
            i += 2
        }
    }
}