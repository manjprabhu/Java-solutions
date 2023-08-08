package com.mnj.java_solutions.array;

import java.util.Arrays;

public class BusConductorPOTD21052023 {

    public void busConductor() {
        int[] chairs = {2, 2, 6, 6};
        int[] passenger = {1, 3, 2, 6};

        Arrays.sort(chairs);
        Arrays.sort(passenger);

        int result = 0;

        for (int i = 0; i < chairs.length; i++) {
            result += Math.abs(chairs[i] - passenger[i]);
        }
        System.out.println("==>> Result: " + result);
    }
}
