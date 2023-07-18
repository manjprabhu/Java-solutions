package com.mnj.java_solutions.binarysearch;

public class CountOccurrencesInSortedArray {

    public void countOccurrencesInSortedArray() {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 4;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                count++;
        }
        System.out.println("==>> Element " + x + " appears  " + count + " times...");
    }

    public void countOccurrencesInSortedArray2() {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 4;

        int low = 0;
        int high = arr.length - 1;
        int count = 0;

        System.out.println("==>> Element " + x + " appears  " + count + " times");
    }
}
