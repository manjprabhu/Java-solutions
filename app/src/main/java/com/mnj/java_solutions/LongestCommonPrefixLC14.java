package com.mnj.java_solutions;

import java.util.Arrays;

public class LongestCommonPrefixLC14 {

    public void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};

        Arrays.sort(strs);  // sort the aray
        StringBuilder result = new StringBuilder();

        char[] first = strs[0].toCharArray(); // first string in sorted array
        char[] last = strs[strs.length - 1].toCharArray(); // last word in sorted array

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {  // if first char of last and first string are not same then there is no common prefix
                break;
            }
            result.append(first[i]);
        }
        if (result.toString().isEmpty()) {
            System.out.println("==>> NO Common prefix exists");
        } else {
            System.out.println("==>> Common prefix is :" + result);
        }

    }
}
