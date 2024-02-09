package com.mnj.java_solutions

/**
 * Given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 *
 *
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
class RotateImageLC48 {
    fun rotate() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val n = matrix.size
        for (ints in matrix) {
            for (j in matrix.indices) {
                println("==>> Original Matrix:" + ints[j])
            }
        }
        for (i in 0 until (n + 1) / 2) {
            for (j in 0 until n / 2) {

                //Start the 4 way swapping

                //temp = bottomLeft
                val temp = matrix[n - 1 - j][i]

                //bottom left = bottom right
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1]

                //bottom right = top right
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i]

                //top right = top left
                matrix[j][n - 1 - i] = matrix[i][j]

                //topleft = temp;
                matrix[i][j] = temp
            }
        }
        for (ints in matrix) {
            for (j in matrix.indices) {
                println("==>> Rotated Matrix:" + ints[j])
            }
        }
    } /*
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
