package com.mnj.java_solutions;

/**
 * Given an array A[] consisting of 0’s and 1’s.
 * A flip operation is one in which you turn 1 into 0 and a 0 into 1.
 * You have to do at most one “Flip” operation of any subarray.
 * Formally, select a range (l, r) in the array A[], such that (0 ≤ l ≤ r < n)
 * holds and flip the elements in this range to get the maximum ones in the final array.
 * You can possibly make zero operations to get the answer.
 * *
 * <p>
 * Input:
 * N = 7
 * A[] = {1, 0, 0, 1, 0, 0, 1}
 * Output:
 * 6
 * Explanation:
 * We can perform a flip operation in the range [1,5]
 * After flip operation array is : [ 1 1 1 0 1 1 1]
 * Count of one after fliping is : 6
 * [Note: the subarray marked in bold is the flipped subarray]
 **/

public class FlipBits15082023 {

    public void maxOnes() {
        int[] a = {1, 0, 0, 1, 0, 0, 1};

        int count = 0;
        int one = 0;
        int max = 0;


        for (int j : a) {
            if (j == 0)
                count++;
            else {
                count--;
                one++;
                if (count < 0)
                    count = 0;
            }
            if (count > max)
                max = count;
        }

        System.out.println("==>> Maximum number of ones :" + (max + one));
    }
}
