package com.mnj.java_solutions.binarysearch;

public class MinimumInSortedRotatedArray {

    public void minimumInSortedRotatedArray() {

        int[] arr = {3,4,5,1,2};

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
