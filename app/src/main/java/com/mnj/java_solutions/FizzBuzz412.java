package com.mnj.java_solutions;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {

    public void fizzBuzz() {
        List<String> result = new ArrayList<>();
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add((String.valueOf(i)));
        }
        for (int i = 0; i < result.size(); i++)
            System.out.println("==>> result :" + result.get(i));
    }

    public void fizzBuzz2() {
        int n = 15;
        List<String> r = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String result = "";

            if (i % 3 == 0) {
                result = result + "Fizz";
            }
            if (i % 5 == 0) {
                result = result + "Buzz";
            }
            if (!result.isEmpty()) {
                r.add(result);
            } else if (result.isEmpty())
                r.add(String.valueOf(i));
        }
        for (int i = 0; i < r.size(); i++)
            System.out.println("==>> Result :" + r.get(i));
    }
}
