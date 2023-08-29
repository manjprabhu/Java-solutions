package com.mnj.java_solutions;

/**
 * Given an array of integers arr, replace each element with its rank.
 *
 * The rank represents how large the element is. The rank has the following rules:
 *
 * Rank is an integer starting from 1.
 * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
 * Rank should be as small as possible.
 *
 * Input: arr = [40,10,20,30]
 * Output: [4,1,2,3]
 * Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
 *
 * Input: arr = [37,12,28,9,100,56,80,5,12]
 * Output: [5,3,4,2,8,6,7,1,3]
 * **/

import java.util.Map;
import java.util.TreeMap;

public class RankTransformOfAnArrayLC1331 {

    void rankTransformAnArray() {

        int[] arr = {40, 10, 20, 30};

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int[] result = new int[arr.length];

        for (int j : arr) {
            map.put(j, 0);
        }

        int rank = 1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), rank++);
        }

        int index = 0;

        for (int i : arr) {
            result[index++] = map.get(i);
        }

        for (int i : result)
            System.out.println("==>> Index:" + i);
    }
}
