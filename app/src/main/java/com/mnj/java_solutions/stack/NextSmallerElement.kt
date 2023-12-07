package com.mnj.java_solutions.stack

import java.util.*

class NextSmallerElement {

    fun nextSmallerElement() {
        val arr = intArrayOf(1, 4, 6, 3, 11, 9, 10)

        val stack = Stack<Int>()

        for (i in arr.size - 1 downTo 1) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                println(" ==>> Next smaller element of " + arr[i] + " is " + -1)
            } else {
                println("==>> Next smaller element of " + arr[i] + " is " + stack.peek())
            }
            stack.push(arr[i])
        }
    }
}