package com.mnj.java_solutions.array;

/**
 * Start with an array A of size N. Initially all elements of the array A are zero.
 * You will be given K positive integers. Let j be one of these integers,
 * you have to add 1 to all A[i], where i ≥ j.
 * task is to print the array A after all these K updates are done.
 * <p>
 * Input:
 * N = 3, K = 4
 * 1 1 2 3
 * Output:
 * 2 3 4
 * Explanation:
 * Initially the array is {0, 0, 0}. After the
 * first 1, it becomes {1, 1, 1}. After the
 * second 1 it becomes {2, 2, 2}. After 2,
 * it becomes {2, 3, 3} and
 * After 3 it becomes, {2, 3, 4}.
 **/
public class AddingOne11062023 {

    //time complexity O(k*N)
    public void addingOne() {
        int[] updates = {0, 0, 0};
        int n = updates.length;
        int k = 4;
        int[] increment = {1, 1, 2, 3};

        for (int i = 0; i < k; i++) {
            // since this is one based indexing we are subtracting -1
            for (int j = increment[i] - 1; j < n; j++) {
                updates[j]++;
            }
        }
        for (int num : updates) {
            System.out.println("==>> Number :" + num);
        }
    }

    public void addingOne2() {
        int[] updates = {0, 0, 0};
        int n = updates.length;
        int k = 4;
        int[] increment = {1, 1, 2, 3};

        for(int i=0;i<k;i++) {
            updates[increment[i]-1]++;
        }

        for(int i=1;i<n;i++)
            updates[i]+=updates[i-1];

        for (int num : updates) {
            System.out.println("==>> Number :" + num);
        }
    }
}
