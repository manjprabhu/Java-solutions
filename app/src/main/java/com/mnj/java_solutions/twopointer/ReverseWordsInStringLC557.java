package com.mnj.java_solutions.twopointer;

public class ReverseWordsInStringLC557 {

    public void reverse() {
        String str = "hello this testing";
        String[] s = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String value : s) {
            result.append(new StringBuilder(value).reverse().toString()).append(" ");
        }
        System.out.println("==>> Reverse words :" + result);
    }

    public void reverseTwoPointer() {
        String str = "hello this testing";

        char[] ch = str.toCharArray();

        int left = 0;
        int right = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {

            if (ch[i] == ' ' || i == length - 1) {

                // right is the index before the space
                // if str[i] is space, then we want to reverse str[l : i - 1]
                // if str[i] is the last character, then we want to reverse str[l : i]

                //set the right pointer
                // if i is at last place then set right  to i
                // if i is at a space then set right  to i-1

                right = i == length - 1 ? i : i - 1;

                // swap the character
                // e.g. s = `Let's` where l is 0 and r is 4
                // Let's -> set'L -> s'teL
                while (left < right) {
                    char tmp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = tmp;
                    left++;
                    right--;
                }
                // update left pointer which is i + 1
                // i.e. the first index of the next word if applicable
                left = i + 1;
            }
        }
        System.out.println("==>> Reverse words  in string: " + new String(ch));
    }

}
