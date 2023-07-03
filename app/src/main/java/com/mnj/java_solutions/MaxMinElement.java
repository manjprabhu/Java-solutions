package com.mnj.java_solutions;

public class MaxMinElement {

    void maxMinElement() {
        System.out.println("==>> Maximum element is :" + maxElement());
        System.out.println("==>> Minimum element is : " + minElement());
    }

    private int maxElement() {
        int[] a = {1, -3, 8, 9, 2, 13};
        int max = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > max)
                max = j;
        }
        return max;
    }

    private int minElement() {
        int[] a = {1, -3, 8, 9, 2, 3};
        int min = Integer.MAX_VALUE;

        for (int j : a) {
            if (j < min)
                min = j;
        }
        return min;
    }


}
