package com.mnj.java_solutions;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums. More formally,
 * if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 **/


public class RemoveDuplicatesFromSortedArray {

    void removeDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};//{1, 1, 1, 2, 2, 3};

        int index = 0;
        for (int num : nums) {
            if (index < 2 || num != nums[index - 2]) {
                nums[index] = num;
                index++;
            }
        }
        System.out.println("==>>> Count of the elements:" + index);
    }
}
