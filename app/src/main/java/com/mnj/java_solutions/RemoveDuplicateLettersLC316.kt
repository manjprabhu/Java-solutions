package com.mnj.java_solutions

import java.util.Stack

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is
 * the smallest in lexicographical order among all possible results.
 */
//1081. Smallest Subsequence of Distinct Characters
class RemoveDuplicateLettersLC316 {
    fun removeDuplicateLetters() {
        val str = "bcabc"
        val lastIndex = IntArray(26) // stores the last occurrence index for every char
        val visited = BooleanArray(26)

        //calculate the last occurrence index.
        for (i in 0 until str.length) lastIndex[str[i].code - 'a'.code] = i
        val stack = Stack<Int>()
        for (i in 0 until str.length) {
            val c = str[i].code - 'a'.code
            if (visited[c]) continue
            visited[c] = true

            //check if top element is stack is lexcograpically greater than current char
            // then check if stack top element exists on right side of current char in staring
            //if yes then remove the stack top element. ( this is to maintaint he lexicographic order)
            //in above string we push b and c to stack , when current char is a , check in stack that if c (stack top element)
            // exists in the given string on right side of current char i.e a,
            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek()] > i) {
                visited[stack.pop()] = false
            }
            stack.push(c)
        }
        val result = StringBuilder()
        for (l in stack) result.append((l + 'a'.code).toChar())
        println("==>> Result string is  :$result")
    }
}
