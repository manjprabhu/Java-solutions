package com.mnj.java_solutions.primenumbers

class PrimeNumbersUptoN {

    fun primeNumbers() {
        val n = 100

        for (i in 2 until n) {
            val result = isPrime(i)
            if (result) {
                println("==>> $i is a prime number")
            }
        }
    }

    private fun isPrime(num: Int): Boolean {
        if (num == 2)
            return true

        for (i in 2..num / 2) {

            if (num % i == 0) {
                return false
            }
        }
        return true
    }
}