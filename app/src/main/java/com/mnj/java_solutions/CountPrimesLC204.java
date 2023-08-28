package com.mnj.java_solutions;

public class CountPrimesLC204 {

    public void countPrime() {
        int result = 0;
        int n = 10;
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                result++;
            }
        }
        System.out.println("==>> Number of prime number below " + n + " are " + result);
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

//Sieve of Eratosthenes

    /**
     * This code implements a solution to count the number of prime numbers less than a given integer n using the Sieve of Eratosthenes algorithm.
     * <p>
     * The algorithm works as follows:
     * <p>
     * Initialize an array isPrime of boolean values to store whether each number from 0 to n is prime or not. Initially, all numbers are assumed to be prime.
     * <p>
     * Mark 0 and 1 as not prime, as they are not prime numbers (According to test cases).
     * <p>
     * Loop through the array from 2 to the square root of n.
     * <p>
     * For each number, if it is marked as prime, then mark all of its multiples as not prime by updating -
     * <p>
     * isPrime[j] = false where j = 2 * i, 3 * i, ..., n
     * <p>
     * Finally, loop through the isPrime array and count the number of prime numbers.
     **/
    public void countPrime2() {
        int n = 10;
        int count = 0;
        boolean dp[] = new boolean[n + 1];

        //Mark every number as prime
        for (int i = 0; i <= n; i++)
            dp[i] = true;

        for (int p = 2; p < n; p++) {
            if (dp[p] == true) {// If prime[p] is not changed, then it is a prime

                // Update all multiples of p greater than or equal to the square of it numbers which
                // are multiple of p and are less than p^2 are already been marked.

                for (int i = p * p; i <= n; i += p)
                    dp[i] = false;

            }
        }

        for (int i = 2; i < n; i++) {
            if (dp[i]) {
                count++;
            }
        }
        System.out.println("==>> Number of prime number below " + n + " are " + count);
    }
}
