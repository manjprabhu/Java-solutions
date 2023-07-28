package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparatorLC2788 {

    public void splitWordsBySeparator() {
        String[] words = {"$easy$", "$problem$"};
        String separator = "$";

        List<String> result = new ArrayList<>();
        for (String word : words) {
            String[] arr = word.split("[" + separator + "]");
            for (String s : arr) {
                if (s.length() > 0) {
                    result.add(s);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("==>> " + result.get(i));
        }
    }
}
