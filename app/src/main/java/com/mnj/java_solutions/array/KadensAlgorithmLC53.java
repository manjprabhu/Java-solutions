package com.mnj.java_solutions.array;

/**
 * Given an integer array, find the subArray
 * with the largest sum, and return its sum.
 */
public class KadensAlgorithmLC53 {

    public void maxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i : nums) {
            currSum += i;

            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0)
                currSum = 0;
        }
        System.out.println("==>> Max sum of subarray :" + maxSum);
    }
}
