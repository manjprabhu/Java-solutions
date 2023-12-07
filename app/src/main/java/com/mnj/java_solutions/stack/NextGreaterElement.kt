package com.mnj.java_solutions.stack

import java.util.*

class NextGreaterElement {

    fun nextGreaterElement() {
        val a = intArrayOf(1, 4, 6, 3, 11, 9, 10)
        val stack = Stack<Int>()

        for (i in a.size - 1 downTo 1) {
            while (!stack.isEmpty() && stack.peek() <= a[i]) {
                stack.pop()
            }
            if (stack.isEmpty())
                println(" ==>> Next greater element of " + a[i] + " is " + -1)
            else
                println("==>> Next greater element of " + a[i] + " is " + stack.peek())
            stack.push(a[i])
        }
    }
}