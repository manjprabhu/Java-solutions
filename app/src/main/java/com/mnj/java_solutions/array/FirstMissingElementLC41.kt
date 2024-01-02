package com.mnj.java_solutions.array

import java.util.*

class FirstMissingElementLC41 {
    fun firstMissingPositive() {
        val nums = intArrayOf(1, 3, 6, 4, 1, 2)
        val minHeap = PriorityQueue<Int>()
        // Add all the positive numbers in the PriorityQueue
        for (num in nums) {
            if (num > 0)
                minHeap.add(num)
        }
        var missingElement = 1
        // Check for all minimum missing positive number
        while (!minHeap.isEmpty()) {
            val element = minHeap.poll()
            if (element == missingElement)
                missingElement++ 
            else if (element > missingElement)
                break
        }
        println("==>> Missing number :$missingElement")
    }
}