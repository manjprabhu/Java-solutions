package com.mnj.java_solutions;

public class IsPrime {

    public void isPrimeNumber() {
        int n = 11;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                System.out.println("==>> " + n + " is NOT a prime number");
                return;
            } else {
                System.out.println("==>> " + n + " is a prime number");
                return;
            }
    }
}
