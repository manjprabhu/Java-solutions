package com.mnj.java_solutions.binarysearch;

public class LastOccurrenceOfNumber {

    public void lastOccurrence() {

        int[] arr = {3, 4, 13, 13, 13, 20, 40};

        int target = 20;

        int index = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("==>> Last occurrence is:" + index);
    }

    public void lastOccurrence2() {
        int[] arr = {3, 4, 13, 13, 13, 20, 40};

        int target = 20;

        int index = -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("==>> Last Occurrence of target is:" + index);
    }
}
