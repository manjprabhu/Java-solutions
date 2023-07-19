package com.mnj.java_solutions.stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementLC496 {

    public void nge() {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 2, 4, 2, 3};

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int index = 0;
        for (int num : nums1) {
            nums1[index++] = map.getOrDefault(num, -1);
        }

        for (int num : nums1) {
            System.out.println("==>> Next greater element is :" + num);
        }

    }

/*
*
*  int[] nums1 = {4,1,2};
   int[] nums2 = {1,3,4,2};
   *
   * 1. stack[1]
   *
   * 2. if(stack is not empty and 1 < 3) {
   *    map(1,3)
   * }
   *   stack[3]
   *
   * 3. if(stack is not empty and 3 < 4)
   *   {
   *     map.put(3,4)
   *    }
   *
   *  stack[4]
   *
   * 4. if(stack is not empty and 4 is not smaller than 2)
   *
   *   stack[ 2, 4]
   *
* */
}
