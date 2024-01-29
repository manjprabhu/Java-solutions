package com.mnj.java_solutions.gfg

class NumberOfOneBits {
    fun setBits() {
        var n = 10
        var count = 0
        while (n != 0) {
            val r = n % 2
            if (r == 1) {
                count++
            }
            n /= 2
        }
        println("==>> Number of 1 bits:$count")
    }
}
