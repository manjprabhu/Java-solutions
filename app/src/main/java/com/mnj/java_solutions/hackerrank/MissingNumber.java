package com.mnj.java_solutions.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given two arrays of integers, find which elements in the second array are missing from the first array.
 * <p>
 * Input:
 * arr [ ] = {7, 2, 5, 3, 5, 3}
 * brr [ ] = {7, 2, 5, 4, 6, 3, 5, 3}
 * <p>
 * Output:
 * Missing numbers: {4, 6}
 * <p>
 * The  brr array is the original list. The numbers missing are [4,6].
 **/
public class MissingNumber {

    public void missingNumber() {
        int[] arr = {7, 2, 5, 3, 5, 3};
        int[] brr = {7, 2, 5, 4, 6, 3, 5, 3};

        List<Integer> result = new ArrayList<>();

        for (int num : brr) {
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    break;
                } else if (i == arr.length - 1) {
                    result.add(num);
                }
            }
        }
        System.out.println("==>> **************** Missing numbers are ****************");
        for (int num : result)
            System.out.println("==>> " + num);
    }

    public void missingNumber2() {
        int[] arr = {7, 2, 5, 3, 5, 3};
        int[] brr = {7, 2, 5, 4, 6, 3, 5, 3};

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : brr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int count = map.get(num);
            count = count - 1;
            if (count == 0) {
                map.remove(num);
            } else {
                map.put(num, count);
            }
        }

        System.out.println("==>> **************** 2 Missing numbers are ****************");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("==>> "+entry.getKey());
        }
    }
}
