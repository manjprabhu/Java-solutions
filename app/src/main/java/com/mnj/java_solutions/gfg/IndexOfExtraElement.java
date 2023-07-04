package com.mnj.java_solutions.gfg;

import android.util.Log;

public class IndexOfExtraElement {


    public void indexOfExtraElement() {

//        int[] a = {2, 4, 6, 8, 9, 10, 12};
//        int[] b = {2, 4, 6, 8, 10, 12};
        int[] a = {3,5,7,9,11,13};
        int[] b = {3,5,7,11,13};


        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] != b[j]) {
                System.out.println("==>> Index of extra element is :" + i);
                return;
            } else {
                i++;
                j++;
            }
        }
    }


}
