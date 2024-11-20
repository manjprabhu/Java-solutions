package com.mnj.java_solutions.stack

import java.util.LinkedList

class QueueImplementationOfStack {

    class Stack {
        val queue = LinkedList<Int>()

        fun push(ele: Int) {
            queue.add(ele)
            for (i in 1 until queue.size) {
                queue.add(queue.remove())
            }
        }

        fun pop() {
            if (queue.isEmpty()) {
                println("==>> Stack underflow")
                return
            }
            println("==>> Popped element is : ${queue.remove()}")
        }

        fun isEmpty() {
            if (queue.isEmpty()) {
                println("==>>> Queue is empty")
                return
            } else
                println("==>>> Queue is NOT empty")
        }

        fun peek() {
            if (queue.isEmpty()) {
                println("==>>> Queue is empty")
                return
            }
            println("==>> Top element is : ${queue.peek()}")
        }
    }

    fun queueImplementation() {
        val stack = Stack()
        stack.push(10)
        stack.push(20)
        stack.push(50)
        stack.push(80)
        stack.push(70)

        stack.peek()
        stack.pop()
        stack.pop()
        stack.isEmpty()
        stack.pop()
        stack.isEmpty()

    }
}