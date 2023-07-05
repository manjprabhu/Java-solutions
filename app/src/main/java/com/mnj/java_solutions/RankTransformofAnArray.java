package com.mnj.java_solutions;


       /* Given an array of integers arr, replace each element with its rank.

        The rank represents how large the element is. The rank has the following rules:

        Rank is an integer starting from 1.
        The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
        Rank should be as small as possible.*/


import java.util.Map;
import java.util.TreeMap;

public class RankTransformofAnArray {

    void rankTransformAnArray() {

        int[] arr = {40, 10, 20, 30};

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
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
