package com.mnj.java_solutions.binarysearch;

public class FirstAndLastPositionOfElementInSortedArray {

    void searchRange() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);

        System.out.println("==>> Start and End index are :" + left + " ," + right);
    }

    private int findLeftBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // check left subarray
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    private int findRightBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // check right subarray
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;

    }
}
