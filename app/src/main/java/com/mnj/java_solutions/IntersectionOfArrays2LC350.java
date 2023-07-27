package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays2 {

    void IntersectionOfArrays() {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                result.add(num);
                map.put(num, map.get(num) - 1);
                if ((map.get(num) == 0)) {
                    map.remove(num);
                }
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println("==>>" + result.get(i));
        }
    }
}
