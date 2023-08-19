package com.mnj.java_solutions.array;

import java.util.HashMap;

public class PairWithGivenSum {

    public void hasArrayTwoCandidates() {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 16;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                System.out.println("Pair with given sum: " + arr[i] + " And " + arr[map.get(sum - arr[i])]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Pair with given sum does NOT exists");
    }
}
