package com.mnj.java_solutions;

public class MajorityElement {

    void majorityElement() {

        int[] a = {6, 5, 5};

        int majority = a[0];
        int votes = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == majority) {
                votes++;
            }
            if (a[i] != majority) {
                votes--;
            }
            if (votes == 0) {
                votes++;
                majority = a[i];
            }
        }

        System.out.println("==>> Majority Element is :" + majority);
    }
}
