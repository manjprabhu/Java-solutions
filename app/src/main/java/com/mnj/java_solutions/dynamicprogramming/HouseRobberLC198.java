package com.mnj.java_solutions.dynamicprogramming;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you
 * <p>
 * from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police
 * <p>
 * if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 **/
public class HouseRobberLC198 {

    public void rob() {
        int[] nums = {6, 9, 6};

        if (nums.length == 0) {
            System.out.println("==>>Nothing to loot");
            return;
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int maxLoot = Math.max(dp[i], dp[i - 1] + nums[i]);
            System.out.println("==>> Maximum loot is :" + maxLoot);
        }
    }

    public void rob2() {
        int[] nums = {6, 9, 6};

        if (nums.length < 2) {
            System.out.println("==>> Maximum loot is :" + nums[0]);
            return;
        }

        //Array to store the maximum loot at each index
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        //If robber choose to rob the nth house then total loot is  : total - nums[n-2]+ nums[n] ( looted the last house)
        //If robber choose to rob the n-1 th house then total loot is  : total - nums[n-1] ( not looted the last house)
        //to maximise the loot apply math.max for above 2 condition

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        System.out.println("==>> 2 Maximum loot is :" + dp[nums.length - 1]);
    }
}
