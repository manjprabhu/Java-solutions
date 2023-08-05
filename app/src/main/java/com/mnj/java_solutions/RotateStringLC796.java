package com.mnj.java_solutions;

public class RotateStringLC796 {

    public void rotateString() {
        String s = "abcde";
        String goal = "bcdea";
        boolean result = s.length() == goal.length() && (s + s).contains(goal);
        if (result) {
            System.out.println("==>> True");
        } else
            System.out.println("==>> false");
    }
}
