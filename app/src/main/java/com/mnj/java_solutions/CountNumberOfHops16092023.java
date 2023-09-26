package com.mnj.java_solutions;

/**
 * A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top of Nth step. As the answer will be large find the answer modulo 1000000007.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 1
 * Output: 1
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Output: 7
 * Explanation:Below are the 7 ways to reach
 * 4
 * 1 step + 1 step + 1 step + 1 step
 * 1 step + 2 step + 1 step
 * 2 step + 1 step + 1 step
 * 1 step + 1 step + 2 step
 * 2 step + 2 step
 * 3 step + 1 step
 * 1 step + 3 step
 **/
public class CountNumberOfHops16092023 {

    public void countWays() {
        int n = 5;
        if (n == 1) {
            System.out.println("==>> Number of steps  is :" + 1);
            return;
        }
        if (n == 2) {
            System.out.println("==>> Number of steps  is :" + 2);
            return;
        }
        if (n == 3) {
            System.out.println("==>> Number of steps  is :" + 4);
            return;
        }
        long a = 1, b = 2, c = 4, ans = 0;

        for (int i = 4; i <= n; i++) {
            ans = (a + b + c) % 1000000007;
            a = b;
            b = c;
            c = ans;
        }
        System.out.println("==>> Number of steps  is :" + ans);
    }
}
