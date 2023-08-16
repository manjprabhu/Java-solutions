package com.mnj.java_solutions.greedy;

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * <p>
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 */
public class JumpGameLC45 {

    public void jump() {
        int[] nums = {2, 3, 1, 1, 4};

        int current = 0;
        int farthest = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);// calculate the farthest jump we can make at any index
            if (i == current) {
                current = farthest;
                jumps++;
            }
        }
        System.out.println("==>> Minimum number of jumps to reach the last  :" + jumps);
    }
}
