package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharactersLC1002 {

    public void common() {

        List<HashMap<Character, Integer>> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String[] words = {"bella", "label", "roller"};

        for (String s : words) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (Character c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            list.add(map);
        }


        for (char ch : list.get(0).keySet()) {
            int min = Integer.MAX_VALUE;
            for (HashMap<Character, Integer> map : list) {
                if (!map.containsKey(ch)) {
//               if map doesn't contain a key then we are sure that this particular character is not common
                    min = 0;
                    break;
                }
                min = Math.min(min, map.get(ch));
            }
            for (int i = 0; i < min; i++) {
                result.add(String.valueOf(ch));
            }
        }

        for (int i = 0; i < result.size(); i++)
            System.out.println("==>>> " + result.get(i));
    }
}
