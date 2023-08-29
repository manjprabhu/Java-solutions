package com.mnj.java_solutions.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * <p>
 * There is only one repeated number in nums, return this repeated number.
 * <p>
 * You must solve the problem without modifying the ar540ray nums and uses only constant extra space.
 **/
public class DuplicateNumberLC287 {

    public void duplicateNumber() {
        int[] num = {1, 7, 3, 4, 3, 3, 5};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    System.out.println("==>> Duplicate element is :" + num[i]);
                    return;
                }
            }
        }
    }

    public void duplicateNumber2() {
        int[] num = {1, 7, 3, 4, 3, 3, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int j : num) {
            if (!set.contains(j)) {
                set.add(j);
            } else {
                System.out.println("==>> Duplicate element is :" + j);
                return;
            }
        }
    }

    public void duplicateNumber3() {
        int[] num = {1, 7, 3, 4, 3, 3, 5};
        Arrays.sort(num);
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                System.out.println("==>> Duplicate Element is :" + num[i]);
                return;
            }
        }
    }

    //Similar approach as linked list cycle detection.
    public void duplicateNumber4() {
        int[] nums = {1, 3, 4, 2, 2};

        //Find the loop in array ( same as linked list loop)
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // As soon as they meet, move both
        // pointers at same speed until they
        // meet again
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println("==>> Duplicate number is :" + slow);
    }
}
