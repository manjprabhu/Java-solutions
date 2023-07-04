package com.mnj.java_solutions;

public class SumMultiples {

    void sumOfMultiples() {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("==>> Sum of multiples:" + sum);
    }
}
