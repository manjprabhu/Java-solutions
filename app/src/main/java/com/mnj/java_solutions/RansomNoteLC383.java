package com.mnj.java_solutions;

public class RansomNoteLC383 {

    public void canConstruct() {
        String magazine ="aaab";
        String ransom = "aaa";

        int[] count  = new int[26];

        for(int i=0;i<magazine.length();i++) {
            count[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<ransom.length();i++) {
            count[ransom.charAt(i)-'a']--;

            if(count[ransom.charAt(i)-'a'] <0) {
                System.out.println("==>> False");
                return;
            }
        }
        System.out.println("==>> True");
    }
}
