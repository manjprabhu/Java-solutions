package com.mnj.java_solutions.dynamicprogramming;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
 * All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile,
 * <p>
 * adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * <p>
 * Input: nums = [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
 **/
public class HouseRobberLC213 {

    //we can skip either first house or last house, so maximum loot will be
    //Math.max(total_loot_skip_last, total_loot_skip_first)

    public void rob() {
        int[] nums = {6, 9, 6};

        if (nums.length < 2) {
            System.out.println("==>> Maximum loot is :" + nums[0]);
            return;
        }

        int[] skipLastHouse = new int[nums.length - 1];
        int[] skipFirstHouse = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            skipLastHouse[i] = nums[i]; // skipped the last house
            skipFirstHouse[i] = nums[i + 1]; // skipped first house
        }

        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);

        System.out.println("==>> 213 Maximum loot is :" + Math.max(lootSkippingFirst, lootSkippingLast));
    }

    private int robHelper(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
