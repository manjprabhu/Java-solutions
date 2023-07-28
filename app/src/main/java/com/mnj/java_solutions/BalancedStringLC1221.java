package com.mnj.java_solutions;

public class BalancedStringLC1221 {

    public void balancedStringSplit() {
        String str = "RLRRLLRLRL";

        int result = 0;

        int balance = 0;

        for (char c : str.toCharArray()) {
            if (c == 'R')
                balance++;
            else if (c == 'L')
                balance--;

            if (balance == 0)
                result++;
        }
        System.out.println("==>> maximum balanced substring are  :" + result);
    }
}
