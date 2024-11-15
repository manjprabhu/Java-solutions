package com.mnj.java_solutions;

import java.util.Arrays;

public class MajorityElementLC169 {

    /**
     * 1. Apply Moore's voting algorithm to find the candidate for majority element
     * 2. check if candidate occurs more than n/2 times
     */
    //Moors voting algorithm
    void majorityElement() {
        int[] a = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};

        int candidate = a[0];
        int votes = 1;

        for (int j : a) {
            if (votes == 0) {
                votes = 1;
                candidate = j;
            } else if (j == candidate) {
                votes++;
            } else {
                votes--;
            }
        }
        // now count the occurrence of candidate  element in array and if  candidate occurs more than n/2 times than candidate is majority element
        // else no majority element exists in array
        int count = 0;
        for (int num : a) {
            if (num == candidate)
                count++;
        }

        if (count > a.length / 2) {
            System.out.println("==>> Majority Element is :" + candidate);
        } else {
            System.out.println("==>> No Majority element:");
        }

    }

    public void majorityElement2() {
        int[] a = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        for (int k : a) {
            int count = 0;
            for (int i : a) {
                if (k == i)
                    count++;
                if (count > a.length / 2) {
                    System.out.println("==>> Majority element is :" + i);
                    return;
                }
            }
        }
        System.out.println("==>> No Majority element:");
    }

    public void majorityElement3() {
        int[] a = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        Arrays.sort(a);
        System.out.println("==>> Majority element is :" + a[a.length / 2]);
    }

}
