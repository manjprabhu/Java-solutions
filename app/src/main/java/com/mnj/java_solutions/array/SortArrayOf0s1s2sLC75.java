package com.mnj.java_solutions.array;

/**
 *
 * This problem is also the same as the famous “Dutch National Flag problem”.
 *
 *
 * Given an array nums with n objects colored red, white, or blue,
 *
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * **/
public class SortArrayOf0s1s2sLC75 {

    public void sort() {

        int[] arr = {1, 1, 0, 1, 2, 1, 0};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        int temp;

        while (mid <= high) {

            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
        }

        for (int n : arr) {
            System.out.println("==>> :" + n);
        }
    }
}
