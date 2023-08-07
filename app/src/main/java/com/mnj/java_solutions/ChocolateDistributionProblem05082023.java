package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array A[ ] of positive integers of size N,
 * where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates.
 * There are M students, the task is to distribute chocolate packets among M students such that :
 * 1. Each student gets exactly one packet.
 * 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
 * Input:
 * N = 8, M = 5
 * A = {3, 4, 1, 9, 56, 7, 9, 12}
 * Output: 6
 * Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6
 * by choosing following M packets :{3, 4, 9, 7, 9}.
 **/


public class ChocolateDistributionProblem05082023 {
    public void findMinDiff() {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(11, 13, 7, 5, 13, 12));
        int m = 4;
        int n = 6;

        Collections.sort(a);

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while (j < n) {
            if (j - i + 1 != m) {
                j++;
            }
            if (j - i + 1 == m) {

                if (a.get(j) - a.get(i) < min) {

                    min = a.get(j) - a.get(i);
                }
                i++;
                j++;
            }
        }
        System.out.println("==>> 1 Minimum chocolates are :" + min);
    }

    public void findMinDiff2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(11, 13, 7, 5, 13, 12));
        int m = 4;
        int n = 6;

        Collections.sort(a);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - m + 1; i++) {
            int j = i + m - 1;

            if (a.get(j) - a.get(i) < min)
            min = a.get(j) - a.get(i);
        }

        System.out.println("==>> 2 Minimum chocolates are :" + min);
    }
}
