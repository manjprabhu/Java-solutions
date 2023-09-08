package com.mnj.java_solutions.array;

/**
 * Equilibrium Index
 * <p>
 * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 * <p>
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 * <p>
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 * <p>
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 **/
public class MiddleIndexInAnArrayLC1991 {

    public void  findMiddleIndex() {
        int[] nums = {2, 3, -1, 8, 4};
        int sum = 0;
        int leftSum = 0;

        for (int j : nums) {
            sum = sum + j;
        }
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];

            if (sum == leftSum) {
                System.out.println("==>> Middle index of the array is :" + i);
            }
            leftSum = leftSum + nums[i];
        }
        System.out.println("==>> No Middle index  array  :");
    }
}
