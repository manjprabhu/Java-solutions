package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

public class CountOfAllSubArrayWithZeroSum {

    public void subArrayWithSumZero() {
        int[] a = {9, -3, 3, -1, 6, -5};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (sum == 0) {
                    count++;
                }
            }
        }
        System.out.println("==>> Number of sub arrays having sum zero: " + count);
    }

    public void subArrayWithSumZero2() {
        int[] a = {9, -3, 3, -1, 6, -5};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == 0) {
                    count++;
                }
            }
        }
        System.out.println("==>>2  Number of sub arrays having sum zero: " + count);
    }

    public void subArrayWithSumZero3() {
        int[] a = {6, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        for (int j : a) {
            prefixSum = prefixSum + j;

            if (!map.containsKey(prefixSum))
                map.put(prefixSum, 1);
            else {
                count = count + map.get(prefixSum);
                map.put(prefixSum, map.get(prefixSum) + 1);
            }
        }
        System.out.println("==>>3  Number of sub arrays having sum zero: " + count);
    }
}
