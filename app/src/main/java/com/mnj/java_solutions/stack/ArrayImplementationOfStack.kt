package com.mnj.java_solutions.stack

class ArrayImplementationOfStack {

    fun arrayImplementationOfStack() {
        val stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(12)
        stack.disply()

        println("==>>> Before Pop")
        stack.pop()
        stack.disply()

    }

    class Stack {
        val size = 10
        val arr = IntArray(size)

        var top = -1

        fun push(value: Int) {
            if (top == size) {
                println("==>> Stack overflow")
                return
            }
            top++
            arr[top] = value
        }

        fun pop() {
            if (top == -1) {
                println("==>> Stack underflow")
                return
            }
            println("Popped element is ${arr[top]}")
            top--
        }

        fun disply() {
            if (top == -1) {
                println("==>> Stack underflow")
                return
            }

            for (i in top downTo 0) {
                println("==>> ${arr[i]}")
            }
        }
    }
}