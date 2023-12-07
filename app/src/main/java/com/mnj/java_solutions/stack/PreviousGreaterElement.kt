package com.mnj.java_solutions.stack

import java.util.*

class PreviousGreaterElement {

    fun previousGreaterElement() {
        val arr = intArrayOf(1, 432, 7, 2, 3, 4, 8)
        val stack = Stack<Int>()

        for (i in arr.indices) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                println(" ==>> Previous greater element of " + arr[i] + " is " + -1)
            } else {
                println("==>> Previous greater element of " + arr[i] + " is " + stack.peek())
            }
            stack.push(arr[i])
        }
    }
}