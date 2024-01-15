package com.mnj.java_solutions

class AddDigits {
    fun addDigits() {
        val num = 28
        val sum: Int = 1 + (num - 1) % 9
        println("==>> Sum of digits:$sum")
    }
}