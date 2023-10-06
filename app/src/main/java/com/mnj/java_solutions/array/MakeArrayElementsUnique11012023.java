package com.mnj.java_solutions.array;

import java.util.Arrays;

/**
 * Given an array arr[ ] of N elements, your task is to find the minimum number of increment operations required to make all the elements of the array unique. ie- no value in the array should occur more than once. In an operation a value can be incremented by 1 only.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 3
 * arr[] = {1, 2, 2}
 * Output:
 * 1
 * Explanation:
 * If we increase arr[2] by 1 then the resulting
 * array becomes {1, 2, 3} and has all unique values.
 * Hence, the answer is 1 in this case.
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * arr[] = {1, 1, 2, 3}
 * Output:
 * 3
 * Explanation:
 * If we increase arr[0] by 3, then all array
 * elements will be unique. Hence, the answer
 * is 3 in this case.
 **/
public class MakeArrayElementsUnique11012023 {

    public void minIncreaments() {
        long ans = 0;
        int arr[] = {1, 1, 2, 3};

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] <= arr[i - 1]) {
                int diff = arr[i - 1] - arr[i];
                ans += diff + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }
        System.out.println("==>> Minimum number of operation to make array elements unique are :" + ans);
    }
}
