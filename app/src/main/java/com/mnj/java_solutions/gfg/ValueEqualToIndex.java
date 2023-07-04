package com.mnj.java_solutions.gfg;

public class ValueEqualToIndex {

    public void valuesEqualToIndex() {
        int[] a = {15, 2, 3, 12,5};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == i+1) {
                System.out.println("==>> Value and Index equal :" + a[i]);
            }
        }

    }
}
