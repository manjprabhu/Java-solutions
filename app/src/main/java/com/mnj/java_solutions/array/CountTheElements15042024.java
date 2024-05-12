package com.mnj.java_solutions.array;

/**
 * Given two arrays a and b both of size n. Given q queries in an array query each having a positive integer x denoting an index of the array a. For each query, your task is to find all the elements less than or equal to a[x] in the array b.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 3
 * a[] = {4,1,2}
 * b[] = {1,7,3}
 * q = 2
 * query[] = {0,1}
 * Output :
 * 2
 * 1
 * Explanation:
 * For 1st query, the given index is 0, a[0] = 4. There are 2 elements(1 and 3) which are less than or equal to 4.
 * For 2nd query, the given index is 1, a[1] = 1. There exists only 1 element(1) which is less than or equal to 1.
 * Example 2:
 * <p>
 * Input:
 * n = 4
 * a[] = {1,1,5,5}
 * b[] = {0,1,2,3}
 * q = 4
 * query[] = {0,1,2,3}
 * Output :
 * 2
 * 2
 * 4
 * 4
 * Explanation:
 * For 1st query and 2nd query, the given index is 0 and 1 respectively, a[0] = a[1] = 1.
 * There are 2 elements(0 and 1) which are less than or equal to 1.
 * For 3rd query and 4th query, the given index is 2 and 3 respectively, a[2] = a[3] = 5.
 * All the 4 elements are less than or equal to 5.
 **/
public class CountTheElements15042024 {

    public void countTheElements() {

        int n = 4;
        int a[] = {1, 1, 5, 5};
        int b[] = {0, 1, 2, 3};
        int q = 4;
        int query[] = {0, 1, 2, 3};

        int ans[] = new int[q];
        int max = a[0];
        for (int x : a)
            max = Math.max(max, x);

        int hash[] = new int[max + 1];

        for (int x : b) {
            if (x <= max)
                hash[x]++;
        }

        for (int i = 1; i <= max; i++) {
            hash[i] += hash[i - 1];
        }
        for (int i = 0; i < q; i++) {
            ans[i] = hash[a[query[i]]];
        }
        for (int i : ans)
            System.out.println("==>> Number of Elements :" + i);
    }
}
