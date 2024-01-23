package com.mnj.java_solutions.array

import java.util.*
class KthLargestElement {
    fun kthLargestElement() {
        val a = intArrayOf(1, 9, 3, 6, 8, 2, 7, 5, 4)
        val k = 3
        val queue = PriorityQueue<Int>()
        for (i in 0 until k) {
            queue.add(a[i])
        }
        for (i in k until a.size) {
            if (queue.peek() < a[i]) {
                queue.poll()
                queue.add(a[i])
            }
        }
        println("==>> K" + k + "th largest element is :" + queue.peek())
    }
}