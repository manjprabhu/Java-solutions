package com.mnj.java_solutions.binarysearch;

public class SearchSingleElementSortedArray {

    public void singleNonDuplicate() {

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int result = -1;

        int n = nums.length;

        for (int i = 0; i <= n - 1; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    result = nums[i];
                    break;
                }
            } else if (i == n - 1) {
                if (nums[i] != nums[i - 1]) {
                    result = nums[i];
                    break;
                }
            } else if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                result = nums[i];
                break;
            }
        }
        System.out.println("==>> First Non repeating element is:" + result);
    }

    public void singleNonDuplicate2() {

    }
}
