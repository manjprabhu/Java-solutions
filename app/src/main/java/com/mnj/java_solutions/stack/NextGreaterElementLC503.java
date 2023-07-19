package com.mnj.java_solutions.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
 * return the next greater number for every element in nums.
 */

public class NextGreaterElementLC503 {

    public void nge() {

        int[] nums = {1, 2, 1};

        Stack<Integer> stack = new Stack<>();
        int[] output = new int[nums.length];
        Arrays.fill(output, -1);

        for (int i = 0; i < 2 * nums.length; i++) {

//            nums[ i % (nums.length)] is the current value.

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % (nums.length)]) {
                output[stack.pop()] = nums[i % (nums.length)];
            }
            if (i < nums.length) {
                stack.push(i);
            }
        }

        for (int num : output) {
            System.out.println("==>> Next greater element is: " + num);
        }
    }
}
