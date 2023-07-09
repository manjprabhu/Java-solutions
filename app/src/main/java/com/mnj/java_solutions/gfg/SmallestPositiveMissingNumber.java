package com.mnj.java_solutions.gfg;

public class SmallestPositiveMissingNumber {

    public void missingNumberBruteForce() {

        int[] arr = {0, -10, 1, -3, 2};
        int n = 5;

        boolean[] visit = new boolean[n + 1];
        for (int i = 0; i < arr.length; i++) {

            System.out.println("==>> i:" + i + "     arr[i]: " + arr[i]);

            if (arr[i] > 0 && arr[i] <= n) {
                System.out.println("==>> i2 :" + i + "   arr[i]2: " + arr[i]);
                System.out.println("==>> -----------------------------------");
                visit[arr[i]] = true;
            }
        }

        for (int i = 1; i < visit.length; i++) {

            System.out.println("==>> Visit : " + visit[i]);
        }

        for (int i = 1; i < visit.length; i++) {
            if (!visit[i]) {
                System.out.println("==>> Smallest missing +ve number is :" + i);
                return;
            }
        }
    }

    public void missingNumber() {

        int[] arr = {0, -10, 1, -3, 2};
        int n = 5;

        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;

            }
        }

        for(int i=0;i<n;i++) {
            if(arr[i] !=i+1) {
                System.out.println("==>> Smallest missing element:" + (i + 1));
                return;
            }

        }
        System.out.println("==>> Smallest missing element:"+ (n+1));
    }
}
