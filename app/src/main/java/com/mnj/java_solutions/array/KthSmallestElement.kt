package com.mnj.java_solutions.array

import java.util.*

class KthSmallestElement {

    fun kthSmallestElement() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3

        val queue = PriorityQueue<Int>(Collections.reverseOrder())

        for (i in 0 until k) {
            queue.add(i)
        }
        for (i in k until arr.size) {
            if (queue.peek() > i) {
                queue.poll()
                queue.add(i)
            }
        }
        println("==>>" + k + " th smallest element is :" + queue.peek())
    }
}