package com.mnj.java_solutions;

public class RemoveDuplicates {


    //Non decreasing order means = Asecnding order + equal elements might also present. ( like duplicate elemtns might also present)

    void RemoveDuplicateFromSortedArray() {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 6, 6};

        int i = 0, j = 0;

        while (i < a.length) {
            if (a[i] == a[j]) {
                i++;
            } else if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
            i++;
        }

        System.out.println("==>> Unique element is :" + (j + 1));
    }
}
