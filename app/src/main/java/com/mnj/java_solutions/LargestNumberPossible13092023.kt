package com.mnj.java_solutions

import java.lang.StringBuilder

/**
 * Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits and whose sum of digits should be equals to 'S'. Return -1 if it is not possible.
 *
 *
 * Example 1:
 *
 *
 * Input: N = 2, S = 9
 * Output: 90
 * Explaination: It is the biggest number
 * with sum of digits equals to 9.
 * Example 2:
 *
 *
 * Input: N = 3, S = 20
 * Output: 992
 * Explaination: It is the biggest number
 * with sum of digits equals to 20.
 */
class LargestNumberPossible13092023 {
    fun findLargest() {
        val n = 2
        var S = 9
        val ans = StringBuilder()
        if (S == 0 && n > 1) {
            println("==>> Not possible")
            return
        }
        for (i in 0 until n) {
            if (S >= 9) {
                ans.append('9')
                S -= 9
            } else {
                ans.append((S + 48).toChar()) //Ascii value of zero is 48
                S = 0
            }
        }

        //Edge case N =2 and S= 20, maximum number we can place is 9 + 9 = 18, so sum of largest possible digits would be 9 and 9
        // so N=2 and S = 20 combination is not possible
        if (S > 0) // eg N=2, S=20
        {
            println("==>> Not possible")
            return
        }
        println("==>> Result is :$ans")
    }
}