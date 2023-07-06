package com.mnj.java_solutions.sorting;

public class QuickSort {

    public void performSorting() {
        int[] a = {2, 1, 6, 10, 4, 1, 3, 9, 7};//{9, -4, 11, 6, 23, 54, 2, -9, 19, -51, 27};

        int low = 0;
        int high = a.length - 1;

        quicksort(low, high, a);
        System.out.println("==>> Sorted Array is :");
        for (int i : a) {
            System.out.println("==>> " + i);
        }

    }

    private void quicksort(int low, int high, int[] a) {
        if (low < high) {
            int pos = partition(low, high, a);
            quicksort(low, pos - 1, a);
            quicksort(pos + 1, high, a);
        }
    }

    private int partition(int low, int high, int[] a) {
        int i = low;
        int j = high;
        int pivot = a[low];

        while (i < j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[j];
        a[j] = pivot;
        pivot = temp;
        return j;
    }

    /*int[] arr = {1, 5, 9, 2, 5, 7, 6, 11, 4};

    public void performSorting() {

        quickSort(0, arr.length - 1);

        for (int i : arr)
            System.out.println("==>> Sorted Array is:" + i);

    }

    private void quickSort(int low, int high) {

        System.out.println("==>> QuickSOrt");
        if (low < high) {
            int position = partition(low, high);
            quickSort(low, position - 1);
            quickSort(position + 1, high);
        }
    }

    private int partition(int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;

    }*/
}
