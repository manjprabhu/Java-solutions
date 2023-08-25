package com.mnj.java_solutions.twopointer;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Example 1:
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 * **/
public class ShuffleTheArrayLC1470 {

    public void shuffle() {
        int[] num = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int i = 0;
        int j = n;

        int[] result = new int[num.length];
        int index = 0;

        while (j < num.length) {

            if (index % 2 == 0) {
                result[index] = num[i];
                i++;
            } else {
                result[index] = num[j];
                j++;
            }
            index++;
        }
        for (int k : result)
            System.out.println("==>> " + k);
    }
}
