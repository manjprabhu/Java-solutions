package com.mnj.java_solutions.gfg;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public void uniqueNumberOfOccurrences() {

        int[] a = {1, 1, 2, 5, 5};//{2, 2, 5, 10, 1, 2, 10, 5, 10, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        if (set.size() == map.size())
            System.out.println("==>> Array contains elements in unique frequency");
        else
            System.out.println("==>> Array DOES NOT contains elements in unique frequency");

    }
}
