package com.mnj.java_solutions.array;

public class SortArrayOf0s1s2s {


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
