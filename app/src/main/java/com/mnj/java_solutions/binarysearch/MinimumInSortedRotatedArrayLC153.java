package com.mnj.java_solutions.binarysearch;

/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <p>
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 **/
public class MinimumInSortedRotatedArrayLC153 {

    public void minimumInSortedRotatedArray() {

        int[] arr = {3, 4, 5, 1, 2};

        int min = Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            //Left part is sorted
            if (arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid + 1;
            } else {
                //Right part is sorted
                min = Math.min(min, arr[mid]);
                high = mid - 1;
            }
        }
        System.out.println("==>> Minimum in sorted and rotated array is :" + min);
    }
}
