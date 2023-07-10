package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DifferenceBetween2ArraysLC2215 {

    void findDifference() {

        int[] nums1 = {1, 2, 3}, nums2 = {2, 4, 6};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num))
                list1.add(num);

        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num))
                list2.add(num);
        }

        List<List<Integer>> result = Arrays.asList(list1,list2);



    }
}
