package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

/***
 * Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs
 * whereas the other two number occur exactly once and are distinct.
 * Find the other two numbers. Return in increasing order.
 *
 * Input:
 * N = 2
 * arr[] = {1, 2, 3, 2, 1, 4}
 * Output:
 * 3 4
 * Explanation:
 * 3 and 4 occur exactly once.
 * **/

public class NonRepeatingNumbers14082023 {

    public void singleNumber() {
        int[] arr = {1, 2, 3, 2, 1, 4};

        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            if (arr[i] != arr[i + 1]) {
                result.add(arr[i]);
                i = i - 1;
            }
        }
        if (result.size() == 1) {
            result.add(arr.length - 1);
        }

        for (int num : result)
            System.out.println("==>> Non repeating numbers are :" + num);
    }

    //Using sets
    public void singleNumber2() {
        int[] arr = {1, 2, 3, 2, 1, 4};
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }

        Iterator<Integer> i = set.iterator();
        System.out.println("==>> 2 Non repeating numbers are :" + i.next() + " and " + i.next());
    }


    //Using maps
    public void singleNumber3() {
        int[] arr = {1, 2, 3, 2, 1, 4};
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            if (map.containsKey(num))
                map.remove(num);
            else
                map.put(num, 1);
        }
        System.out.println("==>> 3 Non repeating numbers are :" + map.firstKey() + " and " + map.lastKey());
    }

    public void singleNumber4() {
        int[] arr = {1, 2, 3, 2, 1, 4};

        int n = 0;
        for (int num : arr) {
            n = n ^ num;
        }

        int r = n & -n;
        int a = 0;
        int b = 0;
        for (int ele : arr) {
            if ((r & ele) == 0)
                a = a ^ ele;
            else
                b = b ^ ele;
        }

        int[] result = {a, b};
        Arrays.sort(result);

        System.out.println("==>> 4 Non repeating numbers are :" + result[0] + " and " + result[1]);
    }
}
