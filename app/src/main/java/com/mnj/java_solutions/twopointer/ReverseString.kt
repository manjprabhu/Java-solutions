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

    fun reverseSolutionTwo() {
        val str  = "hello"
        val token  = str.toCharArray()
        var i=0
        var j= token.size-1

        while(i<j) {
            val temp = token[j]
            token[j]= token[i]
            token[i]= temp
            i++
            j--
        }

        println("==>> Reverse string is ${String(token)}")
    }
}