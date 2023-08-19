package com.mnj.java_solutions.slidingwindow;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array
 * if you can flip at most k 0's.
 **/
public class MaxConsecutiveOnesLC1004 {

    public void longestOnes() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int start = 0;
        int end = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[start] == 0) {
                    k++;
                }
                start++;
            }
            end++;
        }
        System.out.println("==>> Maximum number of ones are :" + (end - start));
    }

    //Maintain a sliding window , where there is at most k zeros.
    public void longestOnes2() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int max = Integer.MIN_VALUE;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        System.out.println("==>>  2 Maximum number of ones are :" + max);
    }
}
