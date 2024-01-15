package com.mnj.java_solutions.queue

import java.util.*

class QueueReversal {
    fun reverseQueue() {
        val queue = createQueue()
        val stack = Stack<Int>()
        while (!queue.isEmpty()) {
            stack.add(queue.peek())
            queue.remove()
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop())
        }
        while (!queue.isEmpty()) {
            println("==>> " + queue.peek())
            queue.remove()
        }
    }

    private fun createQueue(): Queue<Int> {
        val queue: Queue<Int> = LinkedList()
        queue.add(10)
        queue.add(20)
        queue.add(30)
        queue.add(40)
        queue.add(50)
        queue.add(60)
        queue.add(70)
        queue.add(80)
        queue.add(90)
        queue.add(100)
        return queue
    }

    fun reverseQueue2() {
        val queue = createQueue()
        reverse(queue)
        println("==>> ************* Reverse Queue *******************")
        while (!queue.isEmpty()) {
            println("==>> " + queue.peek())
            queue.remove()
        }
    }

    private fun reverse(queue: Queue<Int>) {
        if (queue.size == 0) {
            return
        }
        val ele = queue.peek()
        queue.remove()
        reverse(queue)
        queue.add(ele)
    }
}