package com.mnj.java_solutions.gfg

class IshanLovesChocolate {
    fun chocolates() {
        val arr = intArrayOf(5, 9, 2, 6)
        var min = 0
        var max = arr.size - 1
        while (min < max) {
            if (arr[max] > arr[min]) {
                max--
            } else {
                min++
            }
        }
        println("==>> Chhocolate is:" + arr[min])
    }
}