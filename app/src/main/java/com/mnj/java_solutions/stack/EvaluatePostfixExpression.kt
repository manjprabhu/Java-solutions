package com.mnj.java_solutions.stack

import java.util.Stack

class EvaluatePostfixExpression {

    fun postfixExpression() {
        val expression = "3 4 + 2 * 7 /"
        val tokens = expression.split(" ")
        val stack = Stack<Int>()

        for (c in tokens) {
            when (c) {
                "+" -> stack.push(stack.pop() + stack.pop())
                "-" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a - b)
                }

                "*" -> stack.push(stack.pop() * stack.pop())
                "/" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a / b)
                }

                else -> {
                    stack.push(c.toInt())
                }
            }
            println("Result of postfix expression : ${stack.peek()}")
        }
    }
}
