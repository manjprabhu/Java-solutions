package com.mnj.java_solutions.primenumbers

class AllPrimeInRange {

    fun primeRange() {
        for (i in 1..39) {
            if (isPrime(i)) {
                println("$i is Prime number...")
            }
        }
    }

    private fun isPrime(num: Int): Boolean {

        if (num <= 1)
            return false
        if (num == 2)
            return true
        for (i in 2..num / 2) {
            if (num % i == 0)
                return false
        }
        return true
    }
}