package com.mnj.java_solutions.array;

/**
 * You are given an array arr of n elements. In one operation you can pick two indices i and j, such that arr[i] >= arr[j] and replace the value of arr[i] with (arr[i] - arr[j]). You have to minimize the values of the array after performing any number of such operations.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 3
 * arr = {3,2,4}
 * Output:
 * 1
 * Explanation:
 * 1st Operation : We can pick 4 & 3, subtract 4-3 => {3,2,1}
 * 2nd Opeartion : We can pick 3 & 2, subtarct 3-2 => {1,2,1}
 * 3rd Operation : We can pick 1 & 2, subtract 2-1 => {1,1,1}
 * 4th Opeartion : We can pick 1 & 1, subtract 1-1 => {1,0,1}
 * 5th Operation : We can pick 1 & 1, subtract 1-1 => {0,0,1}
 * After this no operation can be performned, so maximum no is left in the array is 1, so the ans is 1.
 * Example 2:
 * <p>
 * Input:
 * n = 2
 * arr = {2,4}
 * Output:
 * 2
 * Explanation:
 * 1st Operation : We can pick 4 & 2, subtract 4-2 => {2,2}
 * 2nd Operation : We can pick 2 & 2, subtract 2-2 => {0,2}
 * After this no operation can be performned, so maximum no is left in the array is 2, so the ans is 2.
 **/
public class MinimumNumber23042023 {

    public void minimumNumber() {
        int ans = 0;
        int[] arr = {3, 2, 4};

        for (int i = 0; i < n; i++) {
            ans = gcd(ans, arr[i]);
        }
        System.out.println("==>> Result is :" + ans);
    }

    private int gcd(int a, int b)  {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
