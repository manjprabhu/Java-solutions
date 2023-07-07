package com.mnj.java_solutions.gfg;

import java.util.Arrays;

public class MergeTwoSortedArrays {

/*    Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
    Merge them in sorted order without using any extra space.
    Modify arr1 so that it contains the first N elements and modify arr2
    so that it contains the last M elements.
    Input:
    n = 4, arr1[] = [1 3 5 7]
    m = 5, arr2[] = [0 2 6 8 9]
    Output:
    arr1[] = [0 1 2 3]
    arr2[] = [5 6 7 8 9]
    Explanation:
    After merging the two
    non-decreasing arrays, we get,
    0 1 2 3 5 6 7 8 9.
    */

    public void merge() {

        int[] arr1 = {1, 3, 5, 7};

        int[] arr2 = {0, 2, 6, 8, 9};

        int first = arr1.length - 1;

        int second = 0;

        while (first >= 0 && second < arr2.length) {



            if (arr1[first] > arr2[second]) {

                int temp = arr1[first];
                arr1[first] = arr2[second];
                arr2[second] = temp;
                first--;
                second++;
            } else {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("==>> Merge 22");
        for (int element : arr1)
            System.out.println("==>> First Array " + element);

        for (int j : arr2)
            System.out.println("==>> Second Array : " + j);
    }


}
