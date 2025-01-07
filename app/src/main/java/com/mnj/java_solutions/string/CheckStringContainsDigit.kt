package com.mnj.java_solutions.string

class CheckStringContainsDigit {

    fun isStringDigit() {

        val str = "13432534"

        val isDigit = str.all { it.isDigit() }
        if(isDigit)
            println("String contains all digit")
        else
            println("String does not contains all digit")
    }
}