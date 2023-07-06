package com.mnj.java_solutions;

public class SubsequenceLC392 {

    void isSubSequence() {
        String s = "abvc";

        String t = "ahbgdc";

        if (s.length() == 0) {
            System.out.println("==>> " + s + " is subsequence of " + t);
            return;
        }

        int t_pointer = 0;
        int s_pointer = 0;

        while (t_pointer < t.length()) {
            if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                s_pointer++;
                if (s_pointer == s.length()) {
                    System.out.println("==>>> " + s + " is subsequence of " + t);
                    return;
                }
            }
            t_pointer++;
        }
        System.out.println("==>>> " + s + " is NOT a subsequence of " + t);
    }
}
