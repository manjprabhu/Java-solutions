package com.mnj.java_solutions;

public class SearchInsertPosition {

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
