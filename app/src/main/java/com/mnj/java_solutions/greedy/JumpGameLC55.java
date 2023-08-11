package com.mnj.java_solutions.greedy;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * <p>
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what.
 * Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGameLC55 {

    /**
     * nums[i] is the maximum number of jumps that you can make to the right, and i is the distance from the left,
     * also your index is calculated from left end.
     * So, your i (distance of nums[i[ from 0) + nums[i] (max. no. of jumps you can make to right) >= index (position you want to reach)
     **/
    public void canJump() {
        int[] nums = {2, 3, 1, 1, 4};
        int lastGoodIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }

        if (lastGoodIndex == 0) {
            System.out.println("==>> Can jump ");
        } else
            System.out.println("==>> Cannot jump");
    }


    public void canJump2() {
        int[] nums = {2, 3, 1, 1, 4};
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                System.out.println("==>> 2 Cannot jump");
                return;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        System.out.println("==>>2  Can jump ");
    }
}
