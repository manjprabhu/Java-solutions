package com.mnj.java_solutions.gfg;

public class TwoRepeatedElements {

    public void twoRepeatedElement() {
        int[] a = {1, 2, 1, 5, 4, 3,5};

        int[] count = new int[100000];
        int[] res = new int[2];
        int m =0;

        for (int i : a) {
            count[i]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                res[m] =i;
                m++;
                System.out.println("==>> Element is:" + i);
            }
        }

        for (int x : res)
            System.out.println("==>> x:"+x);
    }
}
