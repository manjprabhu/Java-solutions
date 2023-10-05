package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given two arrays A and B each of length N. You can perform the following operation on array A zero or more times.
 * <p>
 * Select any two indices i and j, 1 <= i , j <= N and i != j
 * Set A[i] = A[i] + 2 and A[j] = A[j]-2
 * Find the minimum number of operations required to make A and B equal.
 * <p>
 * Note :
 * <p>
 * Two arrays are said to be equal if the frequency of each element is equal in both of them.
 * Arrays may contain duplicate elements.
 * Example 1:
 * <p>
 * Input:
 * N = 3
 * A[] = {2, 5, 6}
 * B[] = {1, 2, 10}
 * Output: 2
 * Explanation:
 * Select i = 3, j = 2, A[3] = 6 + 2 = 8 and A[2] = 5 - 2 = 3
 * Select i = 3, j = 2, A[3] = 8 + 2 = 10 and A[2] = 3 - 2 = 1
 * Now A = {2, 1, 10} and B = {1, 2, 10}
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * A[] = {3, 3}
 * B[] = {9, 8}
 * Output: -1
 * Explanation:
 * It can be shown that A cannot be made equal to B.
 **/
public class UnequalArrays16042023 {

    public void solution() {

        long sum = 0;
        int A[] = {2, 5, 6};
        int B[] = {1, 2, 10};
        int N = A.length;

        //make two al for storing and separating odd and even ele
        ArrayList<Integer> x[] = new ArrayList[2], y[] = new ArrayList[2];
        for (int i = 0; i < 2; i++) {
            x[i] = new ArrayList<>();
            y[i] = new ArrayList<>();
        }
        //2
        for (int i = 0; i < N; i++) {
            sum += A[i] - B[i];
            if (A[i] % 2 == 0)
                x[0].add(A[i]);
            else
                x[1].add(A[i]);

            if (B[i] % 2 == 0)
                y[0].add(B[i]);
            else
                y[1].add(B[i]);

        }
        // not poss to convert
        if (sum != 0 || x[0].size() != y[0].size()) {
            System.out.println("==>> Result :  " + -1);
            return;
        }

        long ans = 0;

        // sort list one by one and take the difference.
        for (int i = 0; i < 2; i++) {
            Collections.sort(x[i]);
            Collections.sort(y[i]);

            for (int j = 0; j < x[i].size(); j++)
                ans += Math.abs(x[i].get(j) - y[i].get(j)) / 2;
        }
        System.out.println("==>> Result is  :" + (ans / 2));
    }
}
