package com.mnj.java_solutions.gfg;

public class TransitionPoint {

    public void transitionPoint() {

        int[] a = {0, 0, 0, 0, 1, 1, 1, 1};

        int low = 0;
        int high = a.length - 1;
        int tp =-1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (a[mid] == 0) {
                low = mid + 1;
            } else if (a[mid] == 1) {
                high = mid - 1;
                tp = mid;
            }
        }
        System.out.println("==>>> Transition point :"+tp);
    }
}
