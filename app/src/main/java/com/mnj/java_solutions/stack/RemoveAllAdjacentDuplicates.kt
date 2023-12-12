package com.mnj.java_solutions.stack

import java.util.*

class RemoveAllAdjacentDuplicates {
    fun removeDuplicate() {
        val str = "azxxzy"
        val stack = Stack<Char>()
        for (element in str) {
            if (!stack.isEmpty() && stack.peek() == element) {
                stack.pop()
            } else {
                stack.push(element)
            }
        }
        val result = CharArray(stack.size)
        var index = stack.size - 1
        while (!stack.isEmpty()) {
            result[index--] = stack.pop()
        }
        println("==>> Result: " + String(result))
    }
}