package com.mnj.java_solutions

class ReverseNumber {

    fun reverseNumber() {

        var num = 789
        var reverseNumber=0
        while(num > 0) {
            val remainder = num %10
            reverseNumber = reverseNumber*10 + remainder
            num /= 10
        }
        println("==>> Reverse Number is : $reverseNumber")
    }
}