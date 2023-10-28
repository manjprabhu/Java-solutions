package com.mnj.java_solutions;

/**
 * Given an integer, check whether it is Bleak or not.
 * <p>
 * A number n is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., x + countSetBits(x) is not equal to n for any non-negative number x.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 4
 * Output:
 * 1
 * Explanation:
 * There is no x such that x + countSetbit(x) = 4
 * Example 2:
 * <p>
 * Input:
 * 3
 * Output:
 * 0
 * Explanation:
 * 3 is a Bleak number as 2 + countSetBit(2) = 3.
 **/
public class BleakNumber28102023 {

    public void isBleakNumber() {
        int n = 3;

        for (int i = n - 30; i <= n; i++) {
            if (i + countSetBits(i) == n) {
                System.out.println("==>> Not a bleak number ");
                return;
            }
        }
        System.out.println("==>> Bleak number ");
    }

    private int countSetBits(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += (n & 1);
            n = n / 2;
        }
        return cnt;
    }
}
