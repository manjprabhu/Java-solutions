package com.mnj.java_solutions

import java.util.Stack

/**
 * Given a pattern containing only I's and D's. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can't repeat.
 *
 *
 * Example 1:
 *
 *
 * Input:
 * D
 * Output:
 * 21
 * Explanation:
 * D is meant for decreasing, so we choose the minimum number among all possible numbers like 21,31,54,87,etc.
 * Example 2:
 *
 *
 * Input:
 * IIDDD
 * Output:
 * 126543
 * Explanation:
 * Above example is self- explanatory,
 * 1 < 2 < 6 > 5 > 4 > 3
 * I - I - D - D - D
 */
class NumberFollowingPattern10112023 {
    fun printMinNumberForPattern() {
        val str = "IIDDD"
        val st = Stack<Int>()
        var num = 1
        val sb = StringBuilder()
        for (element in str) {
            st.push(num++)
            if (element == 'I') {
                while (!st.empty()) sb.append(st.pop())
            }
        }
        st.push(num++)
        while (st.size > 0) sb.append(st.pop())
        println("==>> Result is :$sb")
    }
}
