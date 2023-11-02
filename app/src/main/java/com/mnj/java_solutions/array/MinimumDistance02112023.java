package com.mnj.java_solutions.array;

public class MinimumDistance02112023 {

    public void minDist() {
        // code here

        int a[] = {1, 2, 3, 2};
        int n = a.length, x = 1, y = 2;
        int dist = (int) (1e9);
        int xi = 0, yi = 0;
        boolean f1 = false, f2 = false;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                f1 = true;
                xi = i;
            } else if (a[i] == y) {
                f2 = true;
                yi = i;
            }

            if (f1 && f2) dist = Math.min(abs(xi, yi), dist);
        }
        if (f1 && f2)
            System.out.println("Minimum distance is $dist");
        else
            System.out.println("Minimum distance is -1");
    }

    int abs(int a, int b) {
        return a > b ? a - b : b - a;
    }
}
