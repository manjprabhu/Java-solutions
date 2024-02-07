package com.mnj.java_solutions

class IsPrime {
    // Check from 2 to n/2
    val isPrimeNumber: Unit
        get() {
            val n = 11
            // Check from 2 to n/2
            for (i in 2..n / 2)
                if (n % i == 0) {
                println("==>> $n is NOT a prime number")
                return
            } else {
                println("==>> $n is a prime number")
                return
            }
        }
}