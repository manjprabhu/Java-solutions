package com.mnj.java_solutions;

public class PlusOne {

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
            for (int x = 0; x < res.length; x++)
                System.out.println("==>> New Array is :::" + res[x]);
        } else {
            for (int ele : digits) System.out.println("==>> New Array is :" + ele);
        }


    }
}
