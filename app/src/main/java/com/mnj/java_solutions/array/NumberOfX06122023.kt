package com.mnj.java_solutions.array

import android.R




class NumberOfX06122023 {

    fun countX() {
        val L = 10
        val R = 20
        val X = 1

        var count = 0
        for (i in L + 1 until R) {
            var num: Int = i
            while (num != 0) {
                if (num % 10 == X) count++
                num /= 10
            }
        }
        println("==>> number of X : $count")
    }
}