package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInEveryWindow {

    public void countDistinct() {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        int start = 0, end = 0;
        int length = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < length) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            if (end - start + 1 < k)
                end++;

            else if (end - start + 1 == k) {
                System.out.println("==>> Number of distinct elements are :" + map.size());

                if (map.get(arr[start]) == 1) {
                    map.remove(arr[start]);
                } else {
                    map.put(arr[start], map.get(arr[start]) - 1);
                }
                end++;
                start++;
            }
        }
    }
}
