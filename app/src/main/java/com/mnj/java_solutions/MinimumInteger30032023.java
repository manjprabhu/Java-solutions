package com.mnj.java_solutions;

/**
 * You are given an array A of size N. Let us denote S as the sum of all integers present in the array. Among all integers present in the array, find the minimum integer X such that S ≤ N*X.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 3,
 * A = { 1, 3, 2}
 * Output:
 * 2
 * Explanation:
 * Sum of integers in the array is 6.
 * since 6 ≤ 3*2, therefore 2 is the answer.
 * Example 2:
 * <p>
 * Input:
 * N = 1,
 * A = { 3 }
 * Output:
 * 3
 * Explanation:
 * 3 is the only possible answer
 **/
public class MinimumInteger30032023 {

    public void minimumInteger() {
        int[] arr = {1, 3, 2};
        int n = arr.length;


        long sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        long min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if((Math.log(sum) <= Math.log(n) + Math.log(arr[i])))
            {
                min= Math.min(min,arr[i]);
            }
        }
        System.out.println("==>> Minimum integer is  :" + (int)min);
    }
}
