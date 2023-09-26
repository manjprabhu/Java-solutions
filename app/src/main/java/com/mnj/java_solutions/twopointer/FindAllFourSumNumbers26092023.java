package com.mnj.java_solutions.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * iven an array A of integers and another number K. Find all the unique quadruple from the given array that sums up to K.
 * <p>
 * Also note that all the quadruples which you return should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5, K = 3
 * A[] = {0,0,2,1,1}
 * Output: 0 0 1 2
 * Explanation: Sum of 0, 0, 1, 2 is equal
 * to K.
 * Example 2:
 * <p>
 * Input:
 * N = 7, K = 23
 * A[] = {10,2,3,4,5,7,8}
 * Output: 2 3 8 10
 * 2 4 7 10
 * 3 5 7 8
 * Explanation: Sum of 2, 3, 8, 10 = 23,
 * sum of 2, 4, 7, 10 = 23 and sum of 3,
 * 5, 7, 8 = 23.
 **/
public class FindAllFourSumNumbers26092023 {

    public void fourSum() {
        int[] arr = {0, 0, 2, 1, 1};
        int k = 3;
        int n = 5;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int start = j + 1;
                int end = n - 1;

                while (start < end) {
                    int sum = arr[i] + arr[j] + arr[start] + arr[end];
                    if (sum == k) {
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[start], arr[end]));
                        if (!set.contains(l)) {
                            list.add(l);
                            set.add(l);
                        }
                        start++;
                        end--;
                    } else if (sum < k) {
                        start++;
                    } else
                        end--;
                }
            }
        }
    }

    //Leetcode solution to handle some of the test cases

    public void fourSum2() {

        int[] arr = {0, 0, 2, 1, 1};
        int k = 3;

        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(arr);


        for (int i = 0; i < n; i++) {

            // avoid the duplicates while moving i:
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {

                // avoid the duplicates while moving j:
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                // 2 pointers:
                int start = j + 1;
                int end = n - 1;
                while (start < end) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[start];
                    sum += arr[end];
                    if (sum == k) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[start]);
                        temp.add(arr[end]);
                        ans.add(temp);
                        start++;
                        end--;

                        // skip the duplicates:
                        while (start < end && arr[start] == arr[start - 1])
                            start++;
                        while (start < end && arr[end] == arr[end + 1])
                            end--;
                    } else if (sum < k)
                        start++;
                    else end--;
                }
            }
        }
    }
}
