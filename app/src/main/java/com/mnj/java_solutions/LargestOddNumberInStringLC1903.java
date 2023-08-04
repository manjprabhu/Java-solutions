package com.mnj.java_solutions;

public class LargestOddNumberInStringLC1903 {

    public void largestOddNumber() {
        String num = "78389";

        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c % 2 == 1) {
                System.out.println("==>> largest odd number is :" + num.substring(0, i + 1));
                return;
            }
        }
        System.out.println("==>> No odd number exists...");
    }
}
