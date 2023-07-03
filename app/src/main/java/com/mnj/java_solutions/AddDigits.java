package com.mnj.java_solutions;

public class AddDigits {

    void addDigits() {
        int num = 28;
        int sum;
        sum = 1 + (num - 1) % 9;
        System.out.println("==>> Sum of digits:" + sum);
    }
}
