package com.mnj.java_solutions;

public class ClimbingStairsLC70 {

    void climbStairs() {
        int n = 4;

        if (n <= 3) {
            System.out.println("==>> Number if ways to climb the stairs:" + n);
            return;
        }

        int prev1 = 3, prev2 = 2;
        int current = 0;
        for (int i = 4; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println("==>> Number if ways to climb the stairs:" + current);
    }
}
