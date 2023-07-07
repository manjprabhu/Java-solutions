package com.mnj.java_solutions;

public class ReverseVowelsOfAString {

    void reverseVowels() {
        String str = "leetcode";


        char[] ch = str.toCharArray();

        int max = ch.length - 1;
        int min = 0;

        while (min < max) {

            if (!isVowel(ch[min])) {
                min++;

            } else if (!isVowel(ch[max])) {
                max--;
            } else {
                char x = ch[min];
                ch[min] = ch[max];
                ch[max] = x;

                min++;
                max--;
            }
        }

        System.out.println("==>> Reverse :" + String.valueOf(ch));
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'A'
                || c == 'e' || c == 'E'
                || c == 'i' || c == 'I'
                || c == 'o' || c == 'O'
                || c == 'u' || c == 'U';
    }
}
