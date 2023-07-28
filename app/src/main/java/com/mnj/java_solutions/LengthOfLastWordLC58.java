package com.mnj.java_solutions;

public class LengthOfLastWordLC58 {

    public void lengthOfLastWord() {
        String str = "    fly me   to   the moon  ";

        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c != ' ') {
                count++;
            } else {
                if (count > 0) {
                    System.out.println("==>> Length of last word :" + count);
                    return;
                }
            }
        }
    }
}
