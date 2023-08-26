package com.mnj.java_solutions.slidingwindow;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value
 * <p>
 * and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * <p>
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 * <p>
 * Input: nums = [5], k = 1
 * Output: 5.00000
 **/
public class MaximumAverageSubarrayLC643 {

    public void maximumAvgOfSubArray() {
        int[] nums = {-1};
        int k = 1;

        int i = 0;
        int j = 0;

        int max = 0;
        int sum = 0;

        while (j < nums.length) {
            sum = sum + nums[j];

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        System.out.println("==>> max sum :" + max);
        System.out.println("==>> Maximum avg is:" + (double) max / k);
    }

    public void maximumAvgOfSubArray2() {
        int[] nums = {-1};
        int k = 1;
        int sum = 0;

        for (int i = 0; i < k; i++)
            sum = sum + nums[i];

        int max = sum;

        int start = 0;
        int end = k;

        while (end < nums.length) {
            sum = sum - nums[start];
            start++;

            sum = sum + nums[end];
            end++;

            max = Math.max(max, sum);
        }
        System.out.println("==>> Maximum avg is:" + (double) max / k);
    }

}
