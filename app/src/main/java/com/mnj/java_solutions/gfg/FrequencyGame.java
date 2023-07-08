package com.mnj.java_solutions.gfg;

import java.util.HashMap;
import java.util.Map;

public class FrequencyGame {

    public void LargeButMinFreq() {

        int[] arr = {2, 2, 5, 50, 1};
//        2,2;
//        5,1;
//        50,1;
//        1,1l

        HashMap<Integer, Integer> map = new HashMap<>();

        int min_value = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;

        int i = 0;
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int value = entry.getValue();
            int key = entry.getKey();

            if (value <= min_value) {
                ans = Math.max(ans, key);
                min_value = value;
            }

        }
        System.out.println("==>> LargeButMinFreq :"+ans);

    }
}
