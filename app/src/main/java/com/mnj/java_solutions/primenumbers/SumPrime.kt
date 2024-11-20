package com.mnj.java_solutions.primenumbers

class SumPrime {

    private fun isPrime(num: Int): Boolean {
        if (num == 2)
            return true
        for (i in 2..num / 2) {
            if (num % i == 0)
                return false
        }
        return true
    }

    fun sumPrime() {
        var sum = 0
        val n = 10
        for (ele in 2..n) {
            if (isPrime(ele))
                sum += ele
        }

        println("==>> Sum of prime numbers $sum")
    }
}