package com.mnj.java_solutions.binarysearch;

public class CeilOfNumber {
//LowerBound of a number and ceil of number are both has same solution
    public void ceilOfNumber() {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};

        int num = 5;
        int ans =0;
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = low + (high-low)/2;

            if(arr[mid] >= num) {
                ans = arr[mid];
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        System.out.println("==>> Ceil of number is:"+ans);
    }
}
