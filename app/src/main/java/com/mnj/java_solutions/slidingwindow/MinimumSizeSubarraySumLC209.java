package com.mnj.java_solutions.slidingwindow;

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 **/
public class MinimumSizeSubarraySumLC209 {

    public void minSubArrayLen() {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int i = 0;
        int j = 0;

        int sum = 0;
        int result = Integer.MAX_VALUE;
        int current;

        while (j < arr.length) {
            sum = sum + arr[j];
            if (sum >= target) {
                while (sum >= target) {
                    sum = sum - arr[i];
                    i++;
                }
                current = j - i + 2;
                result = Math.min(result, current);
            }
            j++;
        }
        System.out.println("==>> result : " + result);
    }
}
