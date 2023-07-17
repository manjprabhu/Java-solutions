package com.mnj.java_solutions.binarysearch;

public class FloorOfNumber {

    public void floorOfNumber() {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int num =5;

        int low = 0;
        int high = arr.length-1;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high-low)/2;

            if(arr[mid] <= num ) {
                ans = arr[mid];
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        System.out.println("==>> Floor of number is:"+ans);
    }
}
