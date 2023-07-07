package com.mnj.java_solutions;

public class CanPlaceFlowersLC605 {

    void canPlaceFlower() {

        int plantSoFar = 0;

        int[] flowerBed = {1, 0, 0, 0, 1};

        int plant = 2;

        for (int i = 0; i < flowerBed.length; i++) {

            if (flowerBed[i] == 0) {

                int prev = (i == 0 || flowerBed[i - 1] == 0 ? 0 : 1);
                int next = (i == flowerBed.length - 1 || flowerBed[i + 1] == 0 ? 0 : 1);

                if (prev == 0 && next == 0) {
                    flowerBed[i] = 1;
                    plantSoFar++;
                }
            }
        }

        if (plantSoFar == plant)
            System.out.println("==>> Can plant flowers");
        else
            System.out.println("==>> Can NOT plant flowers");
    }
}
