package com.mnj.java_solutions.array

class MissingAndRepeatingNumber {
    fun missingAndRepeatedNumber() {
        val arr = intArrayOf(3, 1, 3)
        val n = arr.size
        for (i in 1..n) {
            var count = 0
            for (k in arr) {
                if (k == i) {
                    count++
                }
            }
            if (count == 2) println("==>> Repeated Number is :$i") else if (count == 0) println("==>> Missing Number is :$i")
        }
    }

    fun missingAndRepeatedNumber2() {
        val arr = intArrayOf(4, 3, 6, 2, 1, 1)
        val n = 6
        val count = IntArray(n + 1)
        for (num in arr) {
            count[num]++
        }
        for (i in 1 until count.size) {
            if (count[i] == 0) {
                println("==>>2 Missing number is :$i")
            }
            if (count[i] == 2) {
                println("==>>2 Repeated number is :$i")
            }
        }
    }

    fun missingAndRepeatedNumber3() {
        val arr = intArrayOf(4, 3, 6, 2, 1, 1)
        val n = 6

        //s1-sum  = x-y
        //s2-sum2n
        var s1: Long = 0
        var s2: Long = 0
        val sum2n =
            (n * (n + 1) * (2 * n + 1) / 6).toLong() // sum of squares of first N natural numbers
        val sum = (n * (n + 1) / 2).toLong() // sum  of first N natural numbers
        for (num in arr) {
            s1 += num
            s2 = s2 + num.toLong() * num.toLong()
        }
        val val1 = s1 - sum //x-y
        var val2 = s2 - sum2n
        val2 = val2 / val1 //x +y;
        val x = (val1 + val2) / 2
        val y = x - val1
        println("==>> Repeated number is :$x missing number is  :$y")
    }
}