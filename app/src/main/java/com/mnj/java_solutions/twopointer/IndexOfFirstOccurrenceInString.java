package com.mnj.java_solutions.twopointer;

public class IndexOfFirstOccurrenceInString {

    public void strStr() {
        String hayStack = "sadbutsad";
        String needle = "sad";
        int l = needle.length();

        for (int i = 0; i < hayStack.length() - needle.length() + 1; i++) {
            if (hayStack.charAt(i) == needle.charAt(0)) {
                if (hayStack.substring(i, l).equals(needle)) {
                    System.out.println("==>> Substring index is :" + i);
                    return;
                }
            }
        }
        System.out.println("==>> No substring present");
    }

    public void strStr2() {
        String haystack = "sadbutsadg";
        String needle = "sadg";

        int i = 0;
        int j = 0;
        int start = 0;

        int n1 = haystack.length();
        int n2 = needle.length();
        while (i < n1 && j < n2) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                if (i - start + 1 == n2) {
                    System.out.println("==>> Start of substring :" + start);
                    return;
                }
                i++;
                j++;
            } else {
                j = 0;
                start++;
                i = start;
            }
        }
        System.out.println("==>> Substring does not exists");
    }
}
