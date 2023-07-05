package com.mnj.java_solutions;

import java.util.Arrays;

public class ThreeSumClosest {


    void threeSumClosest() {

        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        // Sort the array
        Arrays.sort(arr);

        int resultSum = arr[0] + arr[1] + arr[2];
        int minDifference = Integer.MAX_VALUE;

        // Now fix the first element and find the other two elements
        for (int i = 0; i < arr.length - 2; i++) {

            // Find other two elements using Two Sum approach
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("==>>> Result sum is 1:" + target);
                    return;
                }
                if (sum < target)
                    left++;
                else
                    right--;

                int diffToTarget = Math.abs(sum - target);
                if (diffToTarget < minDifference) {
                    resultSum = sum;
                    minDifference = diffToTarget;
                }
            }
        }
        System.out.println("==>>> Result sum is :" + resultSum);
    }

}