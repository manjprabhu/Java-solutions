package com.mnj.java_solutions.binarysearch;

public class NumberOfTimesArrayRotated {


    //    The number of rotations in an array is equal to the index(0-based index) of its minimum element.
    public void noOfRotation() {
        int[] arr = {4, 5, 6, 0, 1, 2, 3};

        int ans = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }
        System.out.println("==>> Array has been rotated by " + index + " times");
    }

    public void noOfRotation2() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:

            if (arr[low] <= arr[high]) {
                if (arr[low] < min) {
                    result = low;
                    min = arr[low];
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < min) {
                    result = low;
                    min = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < min) {
                    result = mid;
                    min = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }

        System.out.println("==>> Array has been rotated by " + result + " times");
    }
}
