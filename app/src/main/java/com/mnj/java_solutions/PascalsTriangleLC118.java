package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above
 * <p>
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 **/
public class PascalsTriangleLC118 {

    public void pascalsTriangle() {
        int num = 5;

        List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= num; row++) {
            ans.add(generateRow(row));
        }

        //Display the result
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print("" + ele + " ");
            }
            System.out.println();
        }
    }

    private List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> result = new ArrayList<>();
        result.add(1); //inserting the 1st element

        //calculate the rest of the elements:
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            result.add((int) ans);
        }
        return result;
    }

    //********************************************************************

    public void pascalTriangle() {
        List<List<Integer>> result = new ArrayList<>();
        int numRows = 6;

        if (numRows == 0) {
            display(result);
            return;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if (numRows == 1) {
            display(result);
            return;
        }

        for (int i = 1; i < numRows; i++) {

            List<Integer> prevRow = result.get(i - 1); // get the previous row

            // Start the next row
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1); // In pascal triangle first element is always 1

            // this loop is to fill the rest of the element in a roq ( i.e barring first and last element)
            for (int j = 0; j < i - 1; j++) {
                //ith element  = ith element of previous row  + (i-1)th element of previous row
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);  // In pascal triangle last  element is always 1

            // Add this new row to final result
            result.add(row);
        }
    }

    private void display(List<List<Integer>> ans) {
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print("" + ele + " ");
            }
            System.out.println();
        }
    }
}
