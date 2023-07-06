package com.mnj.java_solutions;

import java.util.HashMap;

public class ContainsDuplicateLC219 {

   /* Given an integer array nums and an integer k, return true if there are two distinct indices i and j
    in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/


    void isContainDuplicate() {

        int[] nums = {1, 2, 3, 1};

        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int pastIndex = map.get(nums[i]);
                if (Math.abs(pastIndex - i) <= k) {
                    System.out.println("==>> True");
                } else {
                    map.put(nums[i], i);
                }
            }
        }

        System.out.println("==>> False");
    }
}
