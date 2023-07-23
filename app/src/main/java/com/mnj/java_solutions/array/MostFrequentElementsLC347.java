package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostFrequentElementsLC347 {

    public void topKFrequent() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[arr.length + 1];

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);

            // each bucket item itself is an array
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] result = new int[k];

        int counter = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {

                for (int i : bucket[pos]) {
                    result[counter++] = i;
                }
            }
        }

        for (int i : result) {
            System.out.println("==>> :" + i);
        }

    }
}
