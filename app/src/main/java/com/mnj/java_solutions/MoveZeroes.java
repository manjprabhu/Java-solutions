package com.mnj.java_solutions;

public class MoveZeroes {

    void moveZerosToEnd() {
        int[] a = {0, 1, 5, 0, 12, 0, 9,7,11,87};

        int insertPosition = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                a[insertPosition] = a[i];
                insertPosition++;
            }
        }
        while (insertPosition != a.length) {
            a[insertPosition++] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("==>> New Array is :" + a[i]);
        }
    }
}
