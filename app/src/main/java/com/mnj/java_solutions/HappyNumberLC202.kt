package com.mnj.java_solutions

import java.util.HashSet

class HappyNumberLC202 {
    /*A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

    Input: n = 19
    Output: true
    Explanation:
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1*/
    val isHappyNumber: Unit
        get() {
            val set = HashSet<Int>()
            while (true) {
                var num = 19
                val original = num
                var sum = 0
                while (num != 0) {
                    sum += Math.pow((num % 10).toDouble(), 2.0).toInt()
                    num /= 10
                }
                if (sum == 1) {
                    println("==>> $original is a HAPPY Number")
                    return
                }
                num = sum
                if (set.contains(num)) {
                    println("==>> $original is a NOT A HAPPY Number")
                    return
                }
                set.add(num)
            }
        }
}