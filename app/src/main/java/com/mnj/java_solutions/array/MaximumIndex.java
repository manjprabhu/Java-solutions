package com.mnj.java_solutions.array;

/**
 * Given an array A[] of N positive integers.
 * The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
 **/

public class MaximumIndex {
    public void maximumIndex() {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int length = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    length = j - i;
            }
            max = Math.max(max, length);
        }
        System.out.println("==>> maximum index is  :" + max);
    }
}
