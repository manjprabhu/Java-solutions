package com.mnj.java_solutions;

/**
 * Given the row number n. Print the n-th row of Pascal’s triangle.
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it
 */

/**
 * Approach:
 * The steps are as follows:
 * <p>
 * 1. We will use a loop(say c) to iterate over each column i.e. from 1 to n. And for each column, we will do the following steps:
     * a. First, we will consider n-1 as n and c-1 as r.
     * b. After that, we will simply calculate the value of the combination using a loop.
     * c. The loop will run from 0 to r. And in each iteration, we will multiply (n-i) with the result and divide the result by (i+1).
     * d. Finally, we will print the element.
 *
 * 2. Finally, the entire row will be printed.
 **/
public class PascalsTriangle119 {

    private  long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    private void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public void pascalsTriangle() {
        int index = 4;
        pascalTriangle(index);
    }
}
