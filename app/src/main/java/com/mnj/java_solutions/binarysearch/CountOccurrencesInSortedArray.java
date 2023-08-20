package com.mnj.java_solutions.binarysearch;

public class CountOccurrencesInSortedArray {

    public void countOccurrencesInSortedArray() {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 4;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                count++;
        }
        System.out.println("==>> Element " + x + " appears  " + count + " times...");
    }

    // We can search first occurrence and last occurrence of the number
    public void countOccurrencesInSortedArray2() {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 121;

        int left = findLeftBound(arr, x);
        int right = findRightBound(arr, x);

        if(left == -1) {
            System.out.println("==>> Element " + x + " does not appear in array");
            return;
        }
        System.out.println("==>> Element " + x + " appears  " + (right - left+1) + " times");
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
