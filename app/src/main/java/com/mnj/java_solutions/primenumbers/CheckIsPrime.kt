package com.mnj.java_solutions.primenumbers

class CheckIsPrime {

    fun isPrime() {
        val n = 141

        for (i in 2 .. n / 2) {
            if (n % i == 0) {
                println("==>> Number is NOT a prime number")
                return
            } else {
                println("==>> Number is a prime number")
                return
            }
        }
    }
}