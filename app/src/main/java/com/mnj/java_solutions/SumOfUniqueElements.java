package com.mnj.java_solutions;

public class SumOfUniqueElements {


    void sumOfUniqueElements() {
        int[] a = {1, 2, 3, 4, 4, 5};

        int[] count = new int[101];
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        for (int i = 0; i < 101; i++) {
            if (count[i] == 1)
                result = result + i;
        }

        System.out.println("==>> Sum is:" + result);
    }


}
