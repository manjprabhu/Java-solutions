package com.mnj.java_solutions.array;

public class MaximumConsecutiveOnesLC485 {

    public void findMaxConsecutiveOnes() {
        int[] nums = {1,1,0,1,1,1};

        int countOnes = 0;
        int j = 0;
        int n = nums.length;
        int maxLength = Integer.MIN_VALUE;

        while (j < n) {
            if (nums[j] == 1) {
                countOnes++;
            } else if (nums[j] == 0) {
                countOnes = 0;
            }
            j++;
            maxLength = Math.max(maxLength, countOnes);
        }
        System.out.println("==>> Maximum consecutive ones: " + maxLength);
    }
}
