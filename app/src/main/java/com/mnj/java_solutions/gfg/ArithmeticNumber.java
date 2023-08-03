package com.mnj.java_solutions.gfg;

public class ArithmeticNumber {

    public void inSequence() {
        int A = 1, B = 3, C = 2;

        int x = A;
        while (Math.abs(x) <= Math.abs(B)) {
            if (x == B) {
                System.out.println("==>> B exists in arithmetic sequence ...");
                return;
            }
            x += C;
        }
        System.out.println("==>> B Does NOT exists in arithmetic sequence ...");
    }

    public void inSequence2() {
        int A = -2, B = -9, C = -7;
// example sequence is -2, -9, -16 ,-23 .....
//        int A = 1, B = 3, C = 2;
//  example sequence is 1, 3, 5,7 ....
        if (A == B) {
            System.out.println("==>> B exists in arithmetic sequence ...");
            return;
        }

        // This gurantees this is valid arithmetic sequence
        if (B > A && C > 0 || B < A && C < 0) {

            //diff b/w two number in sequence  =  multiple of common diff
            if ((B - A) % C == 0) {
                System.out.println("==>> B exists in arithmetic sequence ...");
                return;
            }
        }
        System.out.println("==>> B Does NOT exists in arithmetic sequence ...");
    }
}
