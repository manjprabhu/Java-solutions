package com.mnj.java_solutions.array;

import java.util.HashMap;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * <p>
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * Example 2:
 * <p>
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 **/

public class CheckIfNAndItsDoubleExistsLC1346 {

    public void checkIfExist() {
        int[] arr = {10, 2, 5, 3};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] && i != j) {
                    System.out.println("==>> There exists a pair of number and its double and numbers are : " + arr[i] + "  and  " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("==>> No pair of number and its double exists in array");
    }

    public void checkIfExist2() {
        int[] arr = {3, 1, 7, 11};//{7, 1, 14, 11};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2) && i != map.get(arr[i] / 2)) {
                System.out.println("==>> There exists a pair of number and its double and numbers are : " + arr[i] + " and  " + arr[map.get(arr[i] / 2)]);
                return;
            }

            if (map.containsKey(2 * arr[i]) && i != map.get(2 * arr[i])) {
                System.out.println("==>> There exists a pair of number and its double and numbers are : " + arr[i] + " and  " + arr[map.get(2 * arr[i])]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("==>> No pair of number and its double exists in array");
    }
}
