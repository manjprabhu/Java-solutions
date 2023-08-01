package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

public class SubarraySumsDivisibleByKLC974 {

    public void subarraysDivByK() {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int j = 0;
        int sum = 0;
        int rem = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        while (j < arr.length) {
            sum = sum + arr[j];

            rem = sum % k;

            if (rem < 0)
                rem = rem + k;

            if (map.containsKey(rem)) {
                count = count + map.get(rem);
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            } else {
                map.put(rem, 1);
            }
            j++;
        }

        System.out.println("==>> Sub arrays sum divisible by K:" + count);
    }
}
