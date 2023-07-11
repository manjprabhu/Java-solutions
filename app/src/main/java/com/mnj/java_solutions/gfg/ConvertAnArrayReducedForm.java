package com.mnj.java_solutions.gfg;

import java.util.Arrays;
import java.util.HashMap;

public class ConvertAnArrayReducedForm {

    public void convert() {
        int[] arr = {10, 40, 20};

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] temp = new int[arr.length];

        //Create a copy array
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
//sort the array
        Arrays.sort(temp);

        //Create a map (key will array element, and value will be index)
        for (int i = 0; i < temp.length; i++)
            map.put(temp[i], i);

        //Query every given element and find its index in sorted array.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        for (int num : arr) {
            System.out.println("==>> New Array is:" + num);
        }

    }
}
