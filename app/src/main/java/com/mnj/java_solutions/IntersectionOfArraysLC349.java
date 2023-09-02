package com.mnj.java_solutions;

import java.util.HashSet;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 *
 * Each element in the result must be unique and you may return the result in any order.
 * **/
public class IntersectionOfArraysLC349 {

    void intersection() {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }

        int[] ans = new int[intersect.size()];
        int index = 0;
        for (int num : intersect)
            ans[index++] = num;
    }
}
