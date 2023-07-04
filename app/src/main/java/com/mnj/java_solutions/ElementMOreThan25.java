package com.mnj.java_solutions;

public class ElementMOreThan25 {

    void findSpecialInteger() {
        int[] a = {1, 2, 2, 6, 6, 6, 6, 7};

        int quarter = a.length / 4;

        for (int i = 0; i < a.length - quarter; i++) {
            if (a[i] == a[i + quarter])
                System.out.println("==>> Element " + a[i] + " appears more than %25 of time");
        }

    }
}
