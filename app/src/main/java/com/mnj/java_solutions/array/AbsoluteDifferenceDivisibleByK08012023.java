package com.mnj.java_solutions.array;


/**
 * Given an array of integers of size n and an integer k, find all the pairs in the array whose absolute difference is divisible by k.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 3
 * arr[] = {3, 7, 11}
 * k = 4
 * Output:
 * 3
 * Explanation:
 * (11-3) = 8 is divisible by 4
 * (11-7) = 4 is divisible by 4
 * (7-3) = 4 is divisible by 4
 * <p>
 * Example 2:
 * <p>
 * Input:
 * n = 4
 * arr[] = {1, 2, 3, 4}
 * k = 2
 * Output :
 * 2
 * Explanation:
 * Valid pairs are (1,3), and (2,4).
 **/
public class AbsoluteDifferenceDivisibleByK08012023 {

    public void countPairs() {
        int[] arr = {3, 7, 11};
        int k = 4;

        long result = 0;

        long rem[] = new long[k];

        for (int j : arr) {
            rem[j % k]++;
        }

        for (int i = 0; i < k; i++) {
            result += ((rem[i] - 1) * rem[i]) / 2;
        }
        System.out.println("==>> Minimum number of pairs  :" + result);
    }
}
