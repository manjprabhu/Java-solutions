package com.mnj.java_solutions

class SumOfDigits {

    fun sumOfDigits() {

        var number = 1238
        val org = number
        var sum =0

        while(number>0) {
            val remainder = number%10
            sum += remainder
            number /= 10
        }

        println("==>> Sum of digits of number $org is $sum")
    }
}