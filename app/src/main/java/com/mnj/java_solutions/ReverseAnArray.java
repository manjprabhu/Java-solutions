package com.mnj.java_solutions;

public class ReverseAnArray {

    void reverseAnArray() {
        int[] a = {1, 2, 3, 4, 5, 6, 7,9,11};

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int k : a) System.out.println("==>> Re arranged array is :" + k);
    }
}
