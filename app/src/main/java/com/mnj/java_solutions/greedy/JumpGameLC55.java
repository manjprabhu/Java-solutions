package com.mnj.java_solutions.greedy;

public class JumpGameLC55 {

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
