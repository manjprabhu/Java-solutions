package com.mnj.java_solutions.stack

import java.util.Stack

class BalancedExpression {

    fun isValidExpression() {

        val stack = Stack<Char>()
        val expression = "{()}{}"

        for (ch in expression) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch)
            } else {
                if (!stack.isEmpty() &&
                    ((ch == '}' && stack.peek() == '{') ||
                            (ch == ']' && stack.peek() == '[') ||
                            (ch == ')' && stack.peek() == '('))
                ) {
                    stack.pop()
                } else {
                    println("==>>> Expression in Invalid...")
                    return
                }
            }
        }
        if (stack.isEmpty())
            println("==>>> Expression in Valid...")
        else
            println("==>>> Expression in Invalid...")

    }
}