package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

public class SubArrayWithSumK {

    public void subArray() {
        int[] num = {5, 5, 15, -5, 15, 10, 5};

        int sum = 20;

        for (int i = 0; i < num.length; i++) {

            for (int j = i; j < num.length; j++) {
                int current = 0;

                for (int m = i; m <= j; m++) {
                    current = current + num[m];
                }
                if (current == sum) {
                    System.out.println("==>> Start Index :" + i + " end index :" + j + " length of subarray :" + (j - i + 1));
                    return;
                }
            }
        }
    }

    public void subArray2() {
        int[] num = {5, 5, 15, -5, 15, 10, 5, 7, 3};

        int sum = 20;

        for (int i = 0; i < num.length; i++) {
            int current = 0;
            for (int j = i; j < num.length; j++) {
                current = current + num[j];
                if (current == sum) {
                    System.out.println("==>> 2 Start Index :" + i + " end index :" + j + " length of subarray :" + (j - i + 1));
                    break;
                }
            }
        }
    }

    public void subArray3() {
        int[] num = {5, 5, 15, -5, 15, 10, 5, 2, 3};
        int sum = 20;

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < num.length; i++) {
            prefixSum = prefixSum + num[i];

            if (map.containsKey(prefixSum - sum)) {
                System.out.println("==>> 3 Start Index :" + (map.get(prefixSum - sum) + 1) + " end index :" + i);
            }
            map.put(prefixSum, i);
        }
    }
}
