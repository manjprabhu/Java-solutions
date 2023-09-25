package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * iven two integer array A and B of size N each.
 * A sum combination is made by adding one element from array A and another element of array B.
 * Return the maximum K valid sum combinations from all the possible sum combinations.
 * <p>
 * Note : Output array must be sorted in non-increasing order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 2
 * K = 2
 * A [ ] = {3, 2}
 * B [ ] = {1, 4}
 * Output: {7, 6}
 * Explanation:
 * 7 -> (A : 3) + (B : 4)
 * 6 -> (A : 2) + (B : 4)
 **/
public class MaximumSumCombination25092023 {

    static void maxCombinations() {
        int[] A = {3, 2};
        int[] B = {1, 4};
        int N = 2;
        int K = 2;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = N - 1; i > N - K - 1; i--) {
            for (int j = N - 1; j > N - K - 1; j--) {

                int sum = A[i] + B[j];
                if (queue.size() < K) queue.add(sum);
                else {
                    if (queue.peek() < sum) {
                        queue.remove();
                        queue.add(sum);
                    } else break;
                }
            }
        }
        while (queue.size() > 0) {
            list.add(0, queue.poll());
        }

        System.out.println("==>> Result is ");
        for (int num : list)
            System.out.println("==>> " + num);
    }
}
