package com.mnj.java_solutions;

import java.util.Arrays;

public class FindTargetIndicesAfterSortingArray {

    void getIndices() {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("==>> Indices of element :" + target + " is:" + i);
            }
        }

    }
}
