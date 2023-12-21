package com.mnj.java_solutions

/**
 * In this case, we are given the row number r and the column number c,
 * and we need to find out the element at position (r,c).
 *
 *
 * First, we will consider r-1 as n and c-1 as r.
 * After that, we will simply calculate the value of the combination using a loop.
 * The loop will run from 0 to r. And in each iteration, we will multiply (n-i) with the result and divide the result by (i+1).
 * Finally, the calculated value of the combination will be our answer.
 */
class PascalsTriangle3 {
    fun pascalsTriangle() {
        val r = 5 // row number
        val c = 3 // col number
        var res = 1
        for (i in 0 until c - 1) {
            res *= (r - 1 - i)
            res /= (i + 1)
        }
        println("==>> Element is  :$res")
    }
}