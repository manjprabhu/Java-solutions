package com.mnj.java_solutions.tasks

class VowelsAndConsonants {

    fun vowelsAndConsonants() {
        val str = "Hello World"
        val charArray = str.toCharArray()
        val result = StringBuilder()
        for(c in str) {
            when(c) {
                'a','e','i','o','u' -> {
                    result.append( c.uppercaseChar())
                }
                else -> {
                    result.append(c.lowercaseChar())
                }
            }
        }
        println("==>> Result is : $result")
    }
}