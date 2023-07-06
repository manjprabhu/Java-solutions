package com.mnj.java_solutions;

public class TwoSumSortedArray {

    void twoSumPair() {

        int[] num = {2,3,4};

        int target = 6;

        int i = 0;
        int j = num.length - 1;

        while (i < j) {
            if ((num[i] + num[j]) == target) {
                System.out.println("==>> pair is :" + i + " , " + j);
                i++;
                j--;
            } else if ((num[i] + num[j]) < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}
