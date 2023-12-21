package com.mnj.java_solutions;

/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * <p>
 * Given an integer n, return true if n is an ugly number.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: true
 * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 * Example 3:
 * <p>
 * Input: n = 14
 * Output: false
 * Explanation: 14 is not ugly since it includes the prime factor 7.
 **/
public class UglyNumberLC263 {

    public void isUgly() {
        int n = 70;

        if (n < 1) {
            System.out.println("==>> Not an ugly number ");
            return;
        }
        while (n % 2 == 0)
            n = n / 2;
        while (n % 3 == 0)
            n = n / 3;
        while (n % 5 == 0)
            n = n / 5;

        if (n != 1) {
            System.out.println("==>> Not an ugly number ");
        } else {
            System.out.println("==>> Ugly number ");
        }
    }
}
