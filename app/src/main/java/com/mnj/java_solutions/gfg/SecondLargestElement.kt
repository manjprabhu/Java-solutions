package com.mnj.java_solutions.gfg

import java.util.*

class SecondLargestElement {
    fun secondLargestElement() {
        val k = 2
        val a = intArrayOf(12, 35, 1, 10, 34, 1)
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
        println("==>> " + k + "th largest element is:" + queue.peek())
    }
}