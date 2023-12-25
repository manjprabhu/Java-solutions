package com.mnj.java_solutions.gfg

import java.util.*

class LeadersInArray {
    fun leadersInArray() {
        val a = intArrayOf(16, 17, 4, 3, 5, 2)
        val stack = Stack<Int>()
        stack.push(a[a.size - 1])
        for (i in a.indices.reversed()) {
            if (stack.peek() < a[i]) {
                stack.push(a[i])
            }
        }
        while (!stack.isEmpty()) {
            println("==>> Leaders are:" + stack.pop())
        }
    }
}