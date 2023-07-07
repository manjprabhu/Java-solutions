package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    void kidsWithCandies() {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        int max = Integer.MIN_VALUE;

        List<Boolean> list = new ArrayList();

        for(int candy : candies) {
            max = Math.max(max, candy);
        }

        for(int candy : candies) {
            list.add(extraCandies + candy >= max);
        }

        for (boolean candy : list) {
            System.out.println("==>>  Item:" + candy);
        }
    }
}
