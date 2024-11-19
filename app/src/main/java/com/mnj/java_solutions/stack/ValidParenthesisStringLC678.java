package com.mnj.java_solutions.stack

import java.util.Stack

class ValidParenthesisStringLC678 {
    val isValid: Unit
        get() {
            val str = ")***"

            val stack = Stack<Int>()
            val starStack = Stack<Int>()

            for (i in str.indices) {
                val ch = str[i]

                if (ch == '(') {
                    stack.push(i)
                } else if (ch == '*') {
                    starStack.push(i)
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop()
                    } else if (!starStack.isEmpty()) {
                        starStack.pop()
                    } else {
                        println("==>> Invalid string ......")
                        return
                    }
                }
            }

            while (!stack.isEmpty()) {
                if (starStack.isEmpty()) {
                    println("==>> Invalid string ......")
                    return
                } else if (starStack.peek() < stack.peek()) {
                    println("==>> Invalid string ......")
                    return
                } else {
                    starStack.pop()
                    stack.pop()
                }
            }
            println("==>> Valid  string *******")
        }
}
