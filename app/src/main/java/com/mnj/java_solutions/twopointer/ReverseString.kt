package com.mnj.java_solutions.twopointer

import java.util.Stack

class ReverseString {

    fun reverseSolutionOne() {
        val str = "hello"
        val stack = Stack<Char>()
        val token = str.toCharArray()
        for (ch in token) {
            stack.push(ch)
        }

        var result = ""
        while (!stack.isEmpty()) {
            result += stack.pop()
        }

        println("Reverse string is $result")
    }
}