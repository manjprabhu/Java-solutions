package com.mnj.java_solutions;

public class SegregateEvenOddNumbers {

    void segregateEvenOddNumbers() {

        System.out.println("==>> Segregate numbers");
        int[] arr = {1, 9, 5, 3, 2, 6, 7, 11, 4};
        int n = arr.length;

        int i = 0;
        int j = 0;

        while (j < n) {
            if (arr[j] % 2 == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            } else {
                j++;
            }
        }
        for (int k : arr) System.out.println("==>> New Array is:" + k);
    }
}
