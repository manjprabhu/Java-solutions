package com.mnj.java_solutions.string;

import java.util.TreeMap;

public class ShuffleStringLC1528 {

    public void restoreString() {
        String str = "abc";
        int[] position = {0,1,2};

        TreeMap<Integer, Character> map = new TreeMap<>();

        for (int i = 0; i < position.length; i++) {
            map.put(position[i], str.charAt(i));
        }

        String result = "";
        for (char c : map.values()) {
            result = result + c;
        }
        System.out.println("==>> result string is : " + result);
    }
}
