package com.mnj.java_solutions.twopointer;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 * <p>
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 **/
public class DuplicateZerosLC1089 {

    public void duplicateZeros() {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int len = arr.length;

        if (len == 1)
            return;

        int start = 0, end = len - 1;
        while (start < end) {
            if (arr[start] == 0)
                end--;
            start++;
        }
        if (end == len - 1)
            return;

        for (int i = len - 1; i >= 0 && end >= 0; i--, end--) {
            arr[i] = arr[end];
            if (arr[end] == 0 && end != start) {
                arr[i - 1] = 0;
                i--;
            }
        }

        for (int num : arr) {
            System.out.println("==>> Result is :" + num);
        }
    }
}
