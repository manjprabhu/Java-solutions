package com.mnj.java_solutions;

public class ValidAnagram {

    void isValidAnagram() {
        String st1 = "anagram";
        String st2 = "nagaram";

        if (st1.length() != st2.length()) {
            System.out.println("==>> False");
            return;
        }

        int[] char_counts = new int[26];
        for (int i = 0; i < st1.length(); i++) {
            char_counts[st1.charAt(i) - 'a']++;
            char_counts[st2.charAt(i) - 'a']--;
        }

        for (int count : char_counts) {
            if (count != 0) {
                System.out.println("==>> False");
            }
        }

        System.out.println("==>> True");
    }
}
