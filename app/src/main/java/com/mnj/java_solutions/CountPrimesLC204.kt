package com.mnj.java_solutions

class CountPrimesLC204 {
    fun countPrime() {
        var result = 0
        val n = 10
        for (i in 2 until n) {
            if (isPrimeNumber(i)) {
                result++
            }
        }
        println("==>> Number of prime number below $n are $result")
    }

    private fun isPrimeNumber(n: Int): Boolean {
        for (i in 2..n / 2) if (n % i == 0) {
            return false
        }
        return true
    }
    //Sieve of Eratosthenes
    /**
     * This code implements a solution to count the number of prime numbers less than a given integer n using the Sieve of Eratosthenes algorithm.
     *
     *
     * The algorithm works as follows:
     *
     *
     * Initialize an array isPrime of boolean values to store whether each number from 0 to n is prime or not. Initially, all numbers are assumed to be prime.
     *
     *
     * Mark 0 and 1 as not prime, as they are not prime numbers (According to test cases).
     *
     *
     * Loop through the array from 2 to the square root of n.
     *
     *
     * For each number, if it is marked as prime, then mark all of its multiples as not prime by updating -
     *
     *
     * isPrime[j] = false where j = 2 * i, 3 * i, ..., n
     *
     *
     * Finally, loop through the isPrime array and count the number of prime numbers.
     */
    fun countPrime2() {
        val n = 10
        var count = 0
        val dp = BooleanArray(n + 1)

        //Mark every number as prime
        for (i in 0..n) dp[i] = true
        for (p in 2 until n) {
            if (dp[p] == true) { // If prime[p] is not changed, then it is a prime

                // Update all multiples of p greater than or equal to the square of it numbers which
                // are multiple of p and are less than p^2 are already been marked.
                var i = p * p
                while (i <= n) {
                    dp[i] = false
                    i += p
                }
            }
        }
        for (i in 2 until n) {
            if (dp[i]) {
                count++
            }
        }
        println("==>> Number of prime number below $n are $count")
    }
}