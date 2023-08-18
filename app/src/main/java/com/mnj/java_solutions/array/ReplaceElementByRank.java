package com.mnj.java_solutions.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Problem Statement: Given an array of N integers,
 * the task is to replace each element of the array by its rank in the array.
 * <p>
 * Example 1:
 * Input: 20 15 26 2 98 6
 * Output: 4 3 5 1 6 2
 * Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…
 **/
public class ReplaceElementByRank {

    public void rankElements() {
        int n = 6;
        int[] arr = {20, 15, 26, 2, 98, 6};

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    set.add(arr[j]);
                }
            }
            int rank = set.size() + 1;
            System.out.println("==>> " + rank + " ");
        }
    }

    public void rankElements2() {
        int n = 6;
        int[] arr = {20, 15, 26, 2, 98, 6};

        int[] dummy = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int num : arr) {
            dummy[index++] = num;
        }
        Arrays.sort(dummy);
        int rank = 1;

        for (int i = 0; i < n; i++) {
            if (map.get(dummy[i]) == null) {
                map.put(dummy[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" 2 ==>> " + map.get(arr[i]) + " ");
        }

    }
}
