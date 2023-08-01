package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times
 */
public class MajorityElementLC229 {

    public void majorityElement() {

        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2, 2};

        List<Integer> candidates = new ArrayList<>();

        for (int num : nums) {
            // to check if number already counted above example 1
            if (candidates.size() == 0 || candidates.get(0) != num) {
                int count = 0;
                for (int i : nums) {
                    if (i == num) {
                        count++;
                    }
                }
                if (count > nums.length / 3)
                    candidates.add(num);
            }
            if (candidates.size() == 2)
                break;
        }
        for (int i = 0; i < candidates.size(); i++)
            System.out.println("==>> :" + candidates.get(i));
    }

    public void majorityElement2() {

        // int[] a = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        int[] a = {11, 33, 33, 11, 33, 11, 11, 11, 4, 5};

        int candidate1 = a[0];
        int votes1 = 1;

        int candidate2 = a[1];
        int votes2 = 1;

        for (int j : a) {
            if (votes1 == 0 && j != candidate2) {
                votes1 = 1;
                candidate1 = j;
            } else if (votes2 == 0 && j != candidate2) {
                votes2 = 1;
                candidate2 = j;
            } else if (j == candidate1) {
                votes1++;
            } else if (j == candidate2) {
                votes2++;
            } else {
                votes1--;
                votes2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        int cnt1 = 0;
        int cnt2 = 0;
        for (int j : a) {
            if (j == candidate1) cnt1++;
            if (j == candidate2) cnt2++;
        }

        int mini = (int) (a.length / 3) + 1;
        if (cnt1 >= mini) ls.add(candidate1);
        if (cnt2 >= mini) ls.add(candidate2);

        for (int i = 0; i < ls.size(); i++) {
            System.out.println("==>> Majority elements are :" + ls.get(i));
        }
    }
}
