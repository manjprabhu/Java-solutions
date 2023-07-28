package com.mnj.java_solutions;

public class ClosestNumberToZeroLC2239 {

/*    Given an integer array nums of size n, return the number with the value closest to 0 in nums.
      If there are multiple answers, return the number with the largest value.*/

    void closestNumberToZero() {
        int[] a = {-4, -2, 1, 4, 8};

        int max = Integer.MAX_VALUE;
        int closestNum = 0;

        for (int i : a) {
            if (Math.abs(i) < max) {
                max = Math.abs(i);
                closestNum = i;
            } else if (Math.abs(i) == max && i < closestNum) {
                closestNum = i;
            }
        }
        System.out.println("==>> Number closest to zero is:" + closestNum);
    }
}
