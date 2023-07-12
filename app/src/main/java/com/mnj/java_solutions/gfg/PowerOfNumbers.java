package com.mnj.java_solutions.gfg;

public class PowerOfNumbers {

    public void power() {
        int n = 2;
        int r = 10;
        System.out.println("==>> Power of Number is :" + fun(n, r));
    }

    private long fun(int n, int r) {

        if (r == 0) {
            return 1;
        }

        long ans;
        int mod = 1000000007;

        if (r % 2 == 0) {
            ans = fun(n, r / 2);
            ans = (ans * ans) % mod;
        } else {
            ans = n % mod;
            ans = (ans * fun(n, r - 1) % mod) % mod;
        }

        return (ans) % mod;
    }
}
