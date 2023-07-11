package com.mnj.java_solutions;

import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfArrays {

    void intersection() {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for(int num : nums1) {
            set.add(num);
        }

        for(int num : nums2) {
            if(set.contains(num)) {
                intersect.add(num);
            }
        }


        int[] ans = new int[intersect.size()];
        int index =0;
        for(int num : intersect)
            ans[index++] = num;
    }
}
