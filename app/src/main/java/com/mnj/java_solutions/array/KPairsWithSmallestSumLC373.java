package com.mnj.java_solutions.array;

import android.util.Pair;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class KPairsWithSmallestSumLC373 {

    public void pairs() {
        int[] num1 = {1, 7, 11};
        int[] num2 = {2, 4, 6};
        int k = 3;

        int n = num1.length;
        int m = num2.length;

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        HashSet<Pair<Integer, Integer>> visited = new HashSet<>();

        int i, j;
        queue.add(new int[]{num1[0] + num2[0], 0, 0});  // adding (0,0,) pair to heap
        visited.add(new Pair<Integer, Integer>(0, 0));  // also that particular pair as visited by adding to set

        while (!queue.isEmpty() && k-- > 0) {
            int[] min = queue.remove();
            i = min[1];
            j = min[2];

            System.out.println("==>> Pair is :" + num1[i] + "," + num2[j]);

            if (i < n - 1 && !visited.contains(new Pair<>(i + 1, j))) {
                queue.offer(new int[]{num1[i + 1] + num2[j], i + 1, j});
                visited.add(new Pair<>(i + 1, j));
            }

            if (j < m - 1 && !visited.contains(new Pair<>(i, j + 1))) {
                queue.offer(new int[]{num1[i] + num2[j + 1], i, j + 1});
                visited.add(new Pair<>(i, j + 1));
            }
        }
    }
}
