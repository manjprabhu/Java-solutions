package com.mnj.java_solutions

/**
 * Given a positive integer n, find the nth fibonacci number.
 * Since the answer can be very large, return the answer modulo 1000000007
 *
 *
 * Input:
 * n = 5
 * Output:
 * 5
 * Explanation:
 * 5 is the 5th number of fibonacci series..
 */
class NthFibonacciNumber13082023 {
    fun nthFibonacci() {
        val n = 5
        val m = 1000000007
        var a = 0
        var b = 1
        var ans = a + b
        for (i in 2..n) {
            ans = a + b
            a = b
            b = ans
        }
        println("==>> nth fibonacci number is  :$ans")
    }
}
