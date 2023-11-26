package com.mnj.java_solutions;

import java.util.ArrayList;

/**
 *
 * Print a sequence of numbers starting with N, without using loop, where replace N with N - 5, until N > 0. After that replace N with N + 5 until N regains its initial value.
 *
 * Example 1:
 *
 * Input:
 * N = 16
 * Output:
 * 16 11 6 1 -4 1 6 11 16
 * Explaination:
 * The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.
 *
 * **/
public class PrintPattern26112023 {

    public void pattern() {
        int n = 16;
        int k =n;
        ArrayList<Integer> result = new ArrayList<>();
        while(n>= 0) {
            result.add(n);
            n = n-5;
        }
        while (n <=k) {
            result.add(n);
            n = n+5;
        }

        for (int m : result) {
            System.out.println("==>> Pattern is :"+m);
        }
    }
}
