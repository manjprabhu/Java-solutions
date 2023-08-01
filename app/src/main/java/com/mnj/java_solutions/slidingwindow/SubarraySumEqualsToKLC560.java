package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

public class SubarraySumEqualsToKLC560 {

    public void subArraySum() {
        int[] arr = {1, 1, 1};
        int k = 2;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k)
                    count++;
            }
        }
        System.out.println("==>> Number of subarrays having sum K is :" + count);
    }

    public void subArraySum2() {
        int[] arr = {1, 1, 1};
        int k = 2;

        int count = 0;

        for (int i = 0; i < arr.length; i++) { // start Index

            for (int j = i; j < arr.length; j++) { // end index

                int sum = 0;

                for (int m = i; m <= j; m++) { // count the sum between start & end index
                    sum = sum + arr[m];
                }
                if (sum == k)
                    count++;
            }
        }
        System.out.println("==>> Number of sub Arrays having sum k is :" + count);
    }

    public void subArraySum3() {

        int[] arr = {1, 1, 1};
        int k = 2;

        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        map.put(0, 1);

        for (int j : arr) {
            prefixSum = prefixSum + j;

            int remove = prefixSum - k;

            count = count + map.getOrDefault(remove, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }
        System.out.println("==>>3  Number of sub Arrays having sum k is :" + count);
    }
}
