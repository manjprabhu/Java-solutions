package com.mnj.java_solutions

/**
 * Given the row number n. Print the n-th row of Pascal’s triangle.
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it
 */
/**
 * Approach:
 * The steps are as follows:
 *
 *
 * 1. We will use a loop(say c) to iterate over each column i.e. from 1 to n. And for each column, we will do the following steps:
 * a. First, we will consider n-1 as n and c-1 as r.
 * b. After that, we will simply calculate the value of the combination using a loop.
 * c. The loop will run from 0 to r. And in each iteration, we will multiply (n-i) with the result and divide the result by (i+1).
 * d. Finally, we will print the element.
 *
 * 2. Finally, the entire row will be printed.
 */
class PascalsTriangle119 {
    private fun nCr(n: Int, r: Int): Long {
        var res: Long = 1

        // calculating nCr:
        for (i in 0 until r) {
            res = res * (n - i)
            res = res / (i + 1)
        }
        return res
    }

    private fun pascalTriangle(n: Int) {
        // printing the entire row n:
        for (c in 1..n) {
            print(nCr(n - 1, c - 1).toString() + " ")
        }
        println()
    }

    fun pascalsTriangle() {
        val index = 4
        pascalTriangle(index)
    }
}
