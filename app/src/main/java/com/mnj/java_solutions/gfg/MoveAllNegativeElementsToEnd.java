package com.mnj.java_solutions.gfg;

import java.util.Arrays;

/**
 * Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
 *
 *
 *
 * Example 1:
 *
 * Input :
 * N = 8
 * arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 * Output :
 * 1  3  2  11  6  -1  -7  -5
 * **/
public class MoveAllNegativeElementsToEnd {

    //Order is not maintained here
    public void segregateElements() {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int num : arr)
            System.out.println("==>> Array with segregated elements is :" + num);
    }

    //Two pointer approach
    public void segregateElements2() {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        int[] result = new int[arr.length];
        int j = 0;
        for (int value : arr) {
            if (value >= 0)
                result[j++] = value;
        }

        for (int k : arr) {
            if (k < 0)
                result[j++] = k;
        }

        System.out.println("==>> **************  2 Array with segregated Elements is ****************");
        for (int num : result)
            System.out.println("==>> " + num);
    }
}
