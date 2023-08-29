package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 *
 * **/
public class FindAllDuplicateInAnArrayLC442 {

    public void findDuplicates() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for (int ele : nums) {
            if (set.contains(ele))
                result.add(ele);
            set.add(ele);
        }

        System.out.println("==>> **************** Duplicate elements are ****************");
        for (int num : result)
            System.out.println("==>> "+num);
    }

    public void findDuplicates2() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Get the index, the element corresponds to , since array is zero based index, we subtract by 1
            int index = Math.abs(nums[i]) - 1;

            // If the number is already negative, it means we are encountering it twice and is a duplicate number
            if (nums[index] < 0)
                result.add(index + 1);

            // Flip the number at the index to negative
            nums[index] = nums[index] * -1;
        }

        System.out.println("==>> **************** 2 Duplicate elements are ****************");
        for (int num : result)
            System.out.println("==>> "+num);
    }

}
