package com.mnj.java_solutions.binarysearch;

/**
 * Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key.
 * If the target is not found then return -1.
 **/
public class LastOccurrenceOfNumberInSortedArray {

    public void lastOccurrence() {
        int[] arr = {3, 4, 13, 13, 13, 20, 40};
        int target = 343;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                System.out.println("==>> Last occurrence if number " + target + " is at  index :" + i);
                return;
            }
        }
        System.out.println("==>> Number " + target + " does NOT present in the given array ");
    }

    public void lastOccurrence2() {
        int[] arr = {3, 4, 13, 13, 13, 13, 20, 40, 45};
        int target = 13;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("==>> 2 Number " + target + " does NOT present in the given array ");
            return;
        }
        System.out.println("==>> 2 Last occurrence if number " + target + " is at  index :" + result);
    }

    private int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int res = -1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                res = mid;
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
