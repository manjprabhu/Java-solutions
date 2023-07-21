package com.mnj.java_solutions.slidingwindow;

public class MinimumSizeSubarraySumLC209 {

    public void minSubArrayLen() {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int i = 0;
        int j = 0;

        int sum = 0;
        int result = Integer.MAX_VALUE;
        int current;

        while (j < arr.length) {
            sum = sum + arr[j];
            if (sum >= target) {
                while (sum >= target) {
                    sum = sum - arr[i];
                    i++;
                }
                current = j - i + 2;
                result = Math.min(result, current);
            }
            j++;
        }
        System.out.println("==>> result : " + result);

    }
}
