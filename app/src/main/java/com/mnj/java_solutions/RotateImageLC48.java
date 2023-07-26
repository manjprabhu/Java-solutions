package com.mnj.java_solutions;

/**
 * Given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * <p>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 **/

public class RotateImageLC48 {

    public void rotate() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = matrix.length;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("==>> Original Matrix:" + ints[j]);
            }
        }

        for (int i = 0; i < (n + 1) / 2; i++) {

            for (int j = 0; j < n / 2; j++) {

                //Start the 4 way swapping

                //temp = bottomLeft
                int temp = matrix[n - 1 - j][i];

                //bottom left = bottom right
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];

                //bottom right = top right
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];

                //top right = top left
                matrix[j][n - 1 - i] = matrix[i][j];

                //topleft = temp;
                matrix[i][j] = temp;
            }
        }

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("==>> Rotated Matrix:" + ints[j]);
            }
        }
    }

   /*
   Before rotation
    1, 2, 3
    4, 5, 6
    7, 8, 9

    After rotation
    7, 4, 1
    8, 5, 2
    9, 6, 3
    */
}
