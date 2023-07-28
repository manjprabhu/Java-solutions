package com.mnj.java_solutions;

public class ReverseWordsInStringLC151 {

    //This is correct solution however fails for specific testcase in Leetcode
    public void reverse() {
        String str = "the sky is blue";
        String[] array = str.split(" ");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + " " + array[i];
        }
        System.out.println("==>> Result string is :" + result);
    }

    public void reverseWords() {
        String s = "the sky is blue";
        String result = "";
        int i = 0;
        int n = s.length();

        while(i < n){
            while(i < n && s.charAt(i) == ' ')
                i++;
            if(i >= n)
                break;
            int j = i + 1;

            while(j < n && s.charAt(j) != ' ')
                j++;
            String sub = s.substring(i, j);

            if(result.length() == 0)
                result = sub;
            else {
                result = sub + " " + result;
            }
            i = j+1;
        }
        System.out.println("==>> Result string is :" + result);
    }
}
