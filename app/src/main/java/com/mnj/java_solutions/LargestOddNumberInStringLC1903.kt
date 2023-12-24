package com.mnj.java_solutions

class LargestOddNumberInStringLC1903 {
    fun largestOddNumber() {
        val num = "78389"
        for (i in num.length - 1 downTo 0) {
            val c = num[i]
            if (c.code % 2 == 1) {
                println("==>> largest odd number is :" + num.substring(0, i + 1))
                return
            }
        }
        println("==>> No odd number exists...")
    }
}