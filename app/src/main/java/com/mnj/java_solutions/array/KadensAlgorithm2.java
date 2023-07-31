package com.mnj.java_solutions.array;

/**
 * Given an integer array, find the subArray with the largest sum, and return its sum.
 * Print the start and end position of the array
 */
public class KadensAlgorithm2 {

    public void maxSubArray() {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {5,4,-1,7,8};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int s = 0; //temp start position

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum < 0) {
                currSum = 0;
                start = i + 1;
            }

            if (currSum > maxSum) {
                maxSum = currSum;
//                start = s;
                end = i;
            }
        }

        System.out.println("==>> Max sum of subarray :" + maxSum);
        System.out.println("==>> Array is from :" + start + " to " + end);
    }
}
