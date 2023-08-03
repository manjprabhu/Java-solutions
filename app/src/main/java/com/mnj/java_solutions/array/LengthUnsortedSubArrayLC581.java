package com.mnj.java_solutions.array;

public class LengthUnsortedSubArrayLC581 {
    public void printUnsorted() {
        int[] arr = {10, 12, 20, 30, 8, 40, 32, 31, 35, 50, 60};
        //int[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        int n = 9;

        int i = 0;
        int j = n - 1;
        int start = 0;
        int end = 0;

        while (i < n) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
            i++;
        }

        while (j > 0 ) {
            if (arr[j] < arr[j - 1]) {
                end = j+1;
                break;
            }
            j--;
        }

       // once the above step is done check whether sorting the candidate in unsorted subarray makes the complete
        // array sorted or not.If not include the more elements in to subarray
        // in above example even if sort the elements b/w start and end, still the complete array remains unsorted
        // since 40 > 35 and 8 smaller than 10, hence perform the below 2 steps.


        //Find the minimum and maximum values in arr[start..end]
        int max = arr[start];
        int min = arr[start];
        for (i = start + 1; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        //Find the first element (if there is any) in arr[0..s-1] which is greater than min
        //change start to index of this element
        for (i = 0; i < start; i++) {
            if (arr[i] > min) {
                start = i;
                break;
            }
        }

        //Find the last element (if there is any) in arr[e+1..n-1] which is smaller than max
        // change end to index of this element
        for (i = n - 1; i >= end + 1; i--) {
            if (arr[i] < max) {
                end = i;
                break;
            }
        }
        System.out.println("==>> Start Index :" + start + " End index :" + end);
    }
}
