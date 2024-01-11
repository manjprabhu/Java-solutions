package com.mnj.java_solutions

import java.util.*

/**
 * Given a non-negative integer S represented as a string, remove K digits from the number so that the new number is the smallest possible.
Note : The given num does not contain any leading zero.

Example 1:

Input:
S = "149811", K = 3
Output:
111
Explanation:
Remove the three digits
4, 9, and 8 to form the new number 111
which is smallest.
Example 2:

Input:
S = "1002991", K = 3
Output:
21
Explanation:
Remove the three digits 1(leading
one), 9, and 9 to form the new number 21(Note
that the output must not contain leading
zeroes) which is the smallest.

 **/
class RemoveKDigits11012024 {

    fun removeKDigits(): String {

        val S = "1002991"
        var K = 3

        val stack: Stack<Char> = Stack()
        for (element in S) {
            while (!stack.isEmpty() && stack.peek() > element && K > 0) {
                stack.pop()
                K--
            }
            if (!stack.isEmpty() || element != '0') stack.push(element)
        }
        // number of deletion remaining >0
        while (!stack.isEmpty() && K > 0) {
            stack.pop()
            K--
        }
        if (stack.isEmpty()) {
            return "0"
        }
        val sb = StringBuilder()
        for (ch in stack) {
            sb.append(ch)
        }
        return sb.toString()
    }
}