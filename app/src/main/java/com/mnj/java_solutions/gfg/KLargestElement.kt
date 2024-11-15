package com.mnj.java_solutions.gfg

import java.util.PriorityQueue

class KLargestElement {
    fun kLargest() {
        val arr = intArrayOf(12, 5, 787, 1, 23)

        val k = 3

        val result = IntArray(k)

        val queue = PriorityQueue<Int>()

        for (i in 0 until k) queue.add(arr[i])

        for (i in k until arr.size) {
            if (arr[i] > queue.peek()) {
                queue.poll()
                queue.add(arr[i])
            }
        }


        println("==>> Top K largest elements :" + queue.toTypedArray())
    }
}
