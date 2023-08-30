package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Question: Given 2 sorted arrays, find the intersection elements between them.
 * <p>
 * Array 1: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26
 * Array 2: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33
 * <p>
 * Output: 6, 12, 18, 24
 **/
public class IntersectionOfSortedArrays {

    public void intersection() {
        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26};
        int[] arr2 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33};
        List<Integer> result = new ArrayList<>();

        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2)
                    result.add(num1);
            }
        }
        System.out.println("==>> ************* Intersection of 2 arrays are************ ");
        for (int num : result) {
            System.out.println("==>> " + num);
        }
    }

    public void intersection2() {
        int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26};
        int[] arr2 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33};

        List<Integer> result = new ArrayList<>();

        int first = 0;
        int second = 0;

        while (first < arr1.length && second < arr2.length) {
            if (arr1[first] < arr2[second])
                first++;
            else if (arr1[first] > arr2[second])
                second++;
            else {
                result.add(arr1[first]);
                first++;
                second++;
            }
        }
        System.out.println("==>> ************* 2 Intersection of 2 arrays are************ ");
        for (int num : result) {
            System.out.println("==>> " + num);
        }
    }
}
