package com.mnj.java_solutions.gfg;

public class KthElementOfSpiralMatrix {

    public void findK() {

        int n = 4, m = 4, k = 10;
        int A[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        int count = 0;

        int top = 0, bottom = n - 1, right = m - 1, left = 0;

        while (top <= bottom && left <= right) {

            //Print first row of the matrix;
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k)
                    System.out.println("==>> Kth element is : " + A[top][i]);
            }
            top++;

            //print last column of the matrix
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k)
                    System.out.println("==>> Kth element is : " + A[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k)
                        System.out.println("==>> Kth element is : " + A[bottom][i]);


                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k)
                        System.out.println("==>> Kth element is : " + A[i][left]);
                }
                left++;
            }
        }

    }

}
