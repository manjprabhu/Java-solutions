package com.mnj.java_solutions.stack

import java.util.*

class ReverseStack {
    fun revereStack() {
        val s = Stack<Int>()
        s.push(7)
        s.push(1)
        s.push(4)
        s.push(5)
        reverse(s)

        while (!s.isEmpty()) {
            println("${s.peek()}")
            s.pop()
        }
    }

    private fun reverse(stack: Stack<Int>) {
        println("==>> Reverse ..1")
        if (stack.isEmpty()) // base case
            return

        val element = stack.peek()// Remove the top element
        stack.pop()
        reverse(stack) //Recursively reverse the remaining stack

        println("==>> Reverse ..2")
        insertBottom(stack, element)  //Insert the removed element at the bottom
        println("==>> Reverse ..3")
    }

    private fun insertBottom(stack: Stack<Int>, num: Int) {
        println("==>> insertBottom ..")
        if (stack.isEmpty()) {
            stack.push(num)
            return
        }
        val element = stack.peek()
        stack.pop()
        insertBottom(stack, num)
        stack.push(element)
    }
}