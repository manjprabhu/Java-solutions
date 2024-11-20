package com.mnj.java_solutions.primenumbers

class NthPrimeNumber {

    fun nThPrimeNumber() {
        var count = 0
        var i = 2
        val limit = 5
        while (count < limit) {

            if (isPrime(i)) {
                count++
                if (count == limit)
                    break
            }
            i++
        }

        println("==>> $i")
    }

    private fun isPrime(num: Int): Boolean {
        if (num == 2 || num == 3)
            return true

        for (i in 2..num / 2) {
            if (num % i == 0)
                return false
        }
        return true
    }

}