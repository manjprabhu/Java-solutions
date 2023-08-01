package com.mnj.java_solutions.array;

public class MaximumConsecutiveOnesLC485 {

    public void findMaxConsecutiveOnes() {
        int[] nums = {1, 0};

        int i = 0;
        int j = 0;
        int n = nums.length;
        int maxLength = Integer.MIN_VALUE;

        while (j < n) {
            if (nums[j] == 0) {
                i = 0;
            } else if (nums[j] == 1) {
                i++;
            }
            j++;
            maxLength = Math.max(maxLength, i);
        }
        System.out.println("==>> Max consecutive ones: " + maxLength);
    }
}
