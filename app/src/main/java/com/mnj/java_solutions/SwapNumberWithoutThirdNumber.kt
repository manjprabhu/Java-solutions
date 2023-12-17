package com.mnj.java_solutions

class SwapNumberWithoutThirdNumber {

    fun swap() {
        var x = 10
        var y = 20

        val sum = x + y
        x = sum - x
        y = sum - x
        println("==>> Numbers are x: $x  and y : $y")
    }
}