package com.mnj.java_solutions;

/**
 * iven a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:
 * <p>
 * Double the number
 * Add one to the number
 * Example 1:
 * <p>
 * Input:
 * N = 8
 * Output: 4
 * Explanation:
 * 0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8.
 **/
public class MinimumOperations26102023 {

    public void minOperation() {
        int n = 8;
        int step = 0;
        while (n != 0) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = n - 1;
            step++;
        }
        System.out.println("==>> Number of steps :" + step);
    }
}
