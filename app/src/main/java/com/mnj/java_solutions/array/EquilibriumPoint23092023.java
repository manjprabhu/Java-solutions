package com.mnj.java_solutions.array;

/**
 * Given an array A of n positive numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 * <p>
 * Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 5
 * A[] = {1,3,5,2,2}
 * Output:
 * 3
 * Explanation:
 * equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2).
 * Example 2:
 * <p>
 * Input:
 * n = 1
 * A[] = {1}
 * Output:
 * 1
 * Explanation:
 * Since there's only element hence its only the equilibrium point.
 **/
public class EquilibriumPoint23092023 {

    public void equilibriumPoint() {
        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        int sum = 0;
        int leftSum = 0;

        for (int j : a) {
            sum = sum + j;
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];

            if (sum == leftSum) {
                System.out.println("EquilibriumIndex is:" + i);
                return;
            }
            leftSum = leftSum + a[i];
        }
    }
}
