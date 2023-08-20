package com.mnj.java_solutions.binarysearch;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * <p>
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 **/
public class SearchInsertPositionLC35 {

    void SearchInsertPositionInArray() {
        int[] a = {1, 3, 5, 7};

        int target = 6;

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                System.out.println("==>> Element is found at :" + mid);
                return;
            } else if (target > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("==>> Position to insert at :" + low);

    }
}
