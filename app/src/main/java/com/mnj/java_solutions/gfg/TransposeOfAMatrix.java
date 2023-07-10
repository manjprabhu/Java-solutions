package com.mnj.java_solutions.gfg;

public class TransposeOfAMatrix {

    public void transposeMatrix() {

        int[][] mat = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int[] ints : mat) {
            for (int k = 0; k < mat[0].length; k++) {
                System.out.print(+ints[k] + " ");
            }
            System.out.print("\n");
        }
    }
}
