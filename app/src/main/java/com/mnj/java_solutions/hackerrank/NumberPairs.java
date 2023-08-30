package com.mnj.java_solutions.hackerrank;

import java.util.Arrays;

/**
 * Given an array of integers and a target value, determine the number of pairs of array elements that have a difference equal to the target value.
 * <p>
 * Example
 * Input: arr[ ] = {1, 2, 3, 4}
 * k = 1
 * <p>
 * Output: 3
 **/
public class NumberPairs {

    public void numberOfPairs() {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k)
                    count++;
            }
        }
        System.out.println("==>>  Number of pairs having difference equal to k is :" + count);
    }

    public void numberOfPairs2() {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        int count = 0;

        Arrays.sort(arr);

        for (int num : arr) {
            int numberToSearch = num - k;

            if (binarySearch(arr, numberToSearch))
                count++;
        }
        System.out.println("==>>  2 Number of pairs having difference equal to k is :" + count);
    }

    private boolean binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == num)
                return true;
            else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
