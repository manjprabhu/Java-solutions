package com.mnj.java_solutions;

/**
 * You are given a large integer represented as an integer array digits,
 * <p>
 * where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 * <p>
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 **/
public class PlusOneLC66 {

    void plusOne() {

        int[] digits = {9, 9, 9, 9, 9};

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] res = new int[n + 1];
            res[0] = 1;
            for (int re : res)
                System.out.println("==>> New Array is :::" + re);
        } else {
            for (int ele : digits)
                System.out.println("==>> New Array is :" + ele);
        }
    }
}
