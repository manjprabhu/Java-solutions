package com.mnj.java_solutions.string

class ReverseString {

    fun reverseOne() {
        val str = "java"

        var reverse: String = ""

        for (i in str.length - 1 downTo 0) {
            reverse += str[i]
        }
        println("==>> ONE  Reverse string : $reverse")
    }


    fun reverseTwo() {
        val s = "java"

        var start = 0
        var end = s.length - 1
        val c = s.toCharArray()

        while (start <= end) {
            val a = c[start]
            c[start] = c[end]
            c[end] = a
            end--
            start++
        }
        println("==>> TWO  Reverse string : $c")
    }
}