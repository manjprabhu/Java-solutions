package com.mnj.java_solutions.array;

/**
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 * <p>
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 * Where:
 * <p>
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * Return the array answer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,4,8,3]
 * Output: [15,1,11,22]
 * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
 * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: [0]
 * Explanation: The array leftSum is [0] and the array rightSum is [0].
 * The array answer is [|0 - 0|] = [0].
 **/
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
            result[i] = Math.abs((leftSum - nums[i]) - sum);
        }

        System.out.println("***********  Result Array is ***********");
        for (int num : result)
            System.out.println("==>> :" + num);
    }
}
