package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutations06082023 {

    private ArrayList<String> result = new ArrayList<>();

    public void permutation() {
        String str = "AAA";
        generatePermutation(str, "", result);
        Collections.sort(result);
        for (String s : result) {
            System.out.println("==>>> :" + s);
        }
    }

    private void generatePermutation(String str, String ans, ArrayList<String> list) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String s = str.substring(0, i) + str.substring(i + 1);
            generatePermutation(s, ans + ch, list);
        }
    }
}
