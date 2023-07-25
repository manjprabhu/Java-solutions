package com.mnj.java_solutions;

public class NumberOfPairsWithAbsoluteDifferenceKLC2006 {

    public void findPairs() {

        int[] a = {1, 2, 2, 1};
        int k = 1;

        int count = 0;
        int[] arr = new int[201];

        for (int j : a) {
            arr[j]++;
        }

        for (int i = k + 1; i < arr.length; i++) {
            count = count + arr[i] * arr[i - k];
        }
        System.out.println("==>> Number of pairs :" + count);
    }

}
