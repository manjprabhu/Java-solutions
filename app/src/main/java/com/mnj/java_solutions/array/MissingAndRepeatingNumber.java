package com.mnj.java_solutions.array;

public class MissingAndRepeatingNumber {

    public void missingAndRepeatedNumber() {
        int[] arr = {1, 2, 3, 3};
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int k : arr) {
                if (k == i) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println("==>> Repeated number is :" + i);
            else if (count == 0)
                System.out.println("==>> Missing number is :" + i);
        }
    }

    public void missingAndRepeatedNumber2() {

        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = 6;
        int[] count = new int[n + 1];

        for (int num : arr) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                System.out.println("==>>2 Missing number is :" + i);
            }
            if (count[i] == 2) {
                System.out.println("==>>2 Repeated number is :" + i);
            }
        }
    }

    public void missingAndRepeatedNumber3() {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = 6;


        //s1-sum  = x-y
        //s2-sum2n
        long s1 = 0;
        long s2 = 0;

        long sum2n = n * (n + 1) * (2 * n + 1) / 6; // sum of squares of first N natural numbers
        long sum = n * (n + 1) / 2; // sum  of first N natural numbers

        for (int num : arr) {
            s1 = s1 + num;
            s2 = s2 + (long) num * (long) num;
        }

        long val1 = s1 - sum; //x-y
        long val2 = s2 - sum2n;

        val2 = val2 / val1; //x +y;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        System.out.println("==>> Repeated number is :" + x + " missing number is  :" + y);

    }
}
