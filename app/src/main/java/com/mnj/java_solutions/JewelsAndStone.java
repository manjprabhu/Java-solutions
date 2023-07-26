package com.mnj.java_solutions;

import java.util.HashSet;

public class JewelsAndStone {

    public void jewelAndStones() {
        String jewels = "aA";
        String stones = "aAAbbbb";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i)))
                count++;
        }
        System.out.println("==>> Number of jewels :" + count);
    }
}
