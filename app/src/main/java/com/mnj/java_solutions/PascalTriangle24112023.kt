package com.mnj.java_solutions

import java.util.ArrayList

/**
 * Given a positive integer N, return the Nth row of pascal's triangle.
 * Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.
 * The elements can be large so return it modulo 109 + 7.
 *
 *
 * File:PascalTriangleAnimated2.gif
 *
 *
 * Example 1:
 *
 *
 * Input:
 * N = 4
 * Output:
 * 1 3 3 1
 * Explanation:
 * 4th row of pascal's triangle is 1 3 3 1.
 * Example 2:
 *
 *
 * Input:
 * N = 5
 * Output:
 * 1 4 6 4 1
 * Explanation:
 * 5th row of pascal's triangle is 1 4 6 4 1.
 * Your Task:
 * Complete the function nthRowOfPascalTriangle() which takes n, as input parameters and returns an array representing the answer. You don't to print answer or take inputs.
 */
class PascalTriangle24112023 {
    fun pascalTriangle() {
        val n = 4
        var result = ArrayList<Long>()
        result.add(1L)
        for (i in 1 until n) {
            val next = ArrayList<Long>()
            next.add(1L)
            for (j in 1 until result.size) {
                next.add((result[j] + result[j - 1]) % 1000000007)
            }
            next.add(1L)
            result = next
        }
        for (k in result) println("==>> $k")
    }
}