package com.mnj.java_solutions.stack

import java.util.*

class PreviousSmallerElement {
    fun previousSmallerElement() {
        val arr = intArrayOf(1, 3, 6, 8, 9, 22, 11)

        val stack = Stack<Int>()

        for (i in arr.indices) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                println(" ==>> Previous smaller element of " + arr[i] + " is " + -1)
            } else {
                println("==>> Previous smaller element of " + arr[i] + " is " + stack.peek())
            }
            stack.push(arr[i])
        }
    }
}