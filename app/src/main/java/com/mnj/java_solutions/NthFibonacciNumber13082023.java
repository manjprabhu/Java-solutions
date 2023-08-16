package com.mnj.java_solutions;

/**
 * Given a positive integer n, find the nth fibonacci number.
 * Since the answer can be very large, return the answer modulo 1000000007
 * <p>
 * Input:
 * n = 5
 * Output:
 * 5
 * Explanation:
 * 5 is the 5th number of fibonacci series..
 **/
public class NthFibonacciNumber13082023 {

    public void nthFibonacci() {
        int n = 5;
        int m = 1000000007;

        int a = 0;
        int b = 1;
        int ans = a + b;

        for (int i = 2; i <= n; i++) {
            ans = (a + b);
            a = b;
            b = ans;
        }
        System.out.println("==>> nth fibonacci number is  :" + ans);
    }
}
