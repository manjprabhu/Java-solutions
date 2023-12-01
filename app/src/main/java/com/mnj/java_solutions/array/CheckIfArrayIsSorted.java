package com.mnj.java_solutions.array;

public class CheckIfArrayIsSorted {

    public void isSortedArray() {

        int[] arr = {1, 2, 3, 4, 5,2};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("==>> Array is NOT sorted...");
                return;
            }
        }
        System.out.println("==>> Array is  sorted...");
    }
}
