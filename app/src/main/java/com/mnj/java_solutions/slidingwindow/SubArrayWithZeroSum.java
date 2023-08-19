package com.mnj.java_solutions.slidingwindow;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public void findsum() {
        int[] arr = {4, 2, -3, 1, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum == 0) {
                    System.out.println("==>>> There exists a subarray with zero sum");
                    return;
                }
            }
        }
        System.out.println("==>>> There exists NO subarray with zero sum");
    }

    public void findsum2() {
        int[] arr = {4, 2, -3, 1, 6};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    System.out.println("==>>>2  There exists a subarray with zero sum");
                    return;
                }
            }
        }
        System.out.println("==>>>2  There exists NO subarray with zero sum");
    }

    public void findsum3() {
        int[] arr = {4, 2, -3, 1, 6};
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for (int num : arr) {
            sum = sum + num;

            //If current element is zero
            // if current sum is zero
            // if set already contains zero (in this case, subarray sum b/w current element)
            if (num ==0 || sum == 0 || set.contains(sum)) {
                System.out.println("==>>>3  There exists a subarray with zero sum");
                return;
            }
            set.add(sum);
        }
        System.out.println("==>>>3  There exists NO subarray with zero sum");
    }
}
