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
    }

    private fun reverse(stack: Stack<Int>) {
        println("==>> Reverse ..1")
        if (stack.isEmpty())
            return

        val element = stack.peek()
        stack.pop()
        reverse(stack)

        println("==>> Reverse ..2")
        insertBottom(stack, element)
        println("==>> Reverse ..3")
    }

    private fun insertBottom(stack: Stack<Int>, num: Int) {
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