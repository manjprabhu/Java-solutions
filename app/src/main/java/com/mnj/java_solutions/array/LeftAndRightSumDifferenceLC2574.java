package com.mnj.java_solutions.array;

public class LeftAndRightSumDifferenceLC2574 {

    public void leftRightDifference() {
        int[] nums = {10, 4, 8, 3};

        int sum = 0;
        int leftSum = 0;
        int[] result = new int[nums.length];

        for (int j : nums) {
            sum = sum + j;
        }
        for (int i = 0; i < nums.length; i++) {
            leftSum = leftSum + nums[i];
            sum = sum - nums[i];
            result[i] = Math.abs((leftSum-nums[i])-sum);
        }

        System.out.println("***********  Result Array is ***********");
        for (int num : result)
            System.out.println("==>> :" + num);
    }
}
