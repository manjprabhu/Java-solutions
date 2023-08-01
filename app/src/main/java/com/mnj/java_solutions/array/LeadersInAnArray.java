package com.mnj.java_solutions.array;

import java.util.ArrayList;

public class LeadersInAnArray {

    public void leadersInAnArray() {
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                result.add(arr[i]);
        }

        for (int i = 0; i < result.size(); i++)
            System.out.println("==>> Leaders in array are :" + result.get(i));
    }

    public void leadersInAnArray2() {
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> result = new ArrayList<>();

        result.add(arr[arr.length - 1]);
        int greatest = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > greatest) {
                result.add(arr[i]);
                greatest = arr[i];
            }
        }

        for (int i = 0; i < result.size(); i++)
            System.out.println("==>> Leaders in Array are :" + result.get(i));
    }
}
