package com.mnj.java_solutions;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * <p>
 * Return the sum of the three integers.
 * <p>
 * You may assume that each input would have exactly one solution.
 *
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 **/
public class ThreeSumClosest {

    void threeSumClosest() {

        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        // Sort the array
        Arrays.sort(arr);

        int resultSum = arr[0] + arr[1] + arr[2];
        int minDifference = Integer.MAX_VALUE;

        // Now fix the first element and find the other two elements
        for (int i = 0; i < arr.length - 2; i++) {

            // Find other two elements using Two Sum approach
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("==>>> Result sum is 1:" + target);
                    return;
                }
                if (sum < target)
                    left++;
                else
                    right--;

                int diffToTarget = Math.abs(sum - target);
                if (diffToTarget < minDifference) {
                    resultSum = sum;
                    minDifference = diffToTarget;
                }
            }
        }
        System.out.println("==>>> Result sum is :" + resultSum);
    }

}