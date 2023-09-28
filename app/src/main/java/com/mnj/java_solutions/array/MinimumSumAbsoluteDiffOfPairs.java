package com.mnj.java_solutions.array;

import java.util.Arrays;

/**
 *
 *  int arr[] = {4, 1, 8, 7};
 *  int[] brr = {2, 3, 6, 5};
 *
 *  output = 6;
 *
 *  |1-2| + |4-3| + |7-5| + |8-6| = 6
 **/
public class MinimumSumAbsoluteDiffOfPairs {
    public void findMinSum() {
        int n = 4;
        int arr[] = {4, 1, 8, 7};
        int[] brr = {2, 3, 6, 5};

        Arrays.sort(arr);
        Arrays.sort(brr);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.abs(arr[i] - brr[i]);
        }
        System.out.println("==>> Minimum sum is  :" + sum);
    }
}
