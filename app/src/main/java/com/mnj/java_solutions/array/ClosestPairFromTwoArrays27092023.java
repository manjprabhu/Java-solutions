package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 **/
public class ClosestPairFromTwoArrays27092023 {

    public void printClosest() {

        int[] arr = {1, 4, 5, 7};
        int[] brr = {10, 20, 30, 40};

        int m = brr.length;
        int n = arr.length;
        int x = 32;

        // since we need to store a pair of elements arraylist size will be two
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0));

        int i = 0, j = m - 1;
        int diff = (int) 1e9; // initial  value for diff is infinity /maximum

        while (i < n && j >= 0) {
            int sum = arr[i] + brr[j];
            if (Math.abs(sum - x) < diff) {
                diff = Math.abs(sum-x);
                list.set(0, arr[i]);
                list.set(1, brr[j]);
            }
            if (sum < x)
                i++;
            else
                j--;
        }
        for (int num : list)
            System.out.println("Pair of numbers is :" + num);
    }
}
