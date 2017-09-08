package com.leetcode.test.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/12 14:43
 * Description:
 */
public class TestTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int i, j, k, l;
        for (i = 0; i < n; i++)
            x[i] = scan.nextInt();
        for (j = 0; j < n; j++)
            y[j] = scan.nextInt();
        long[] result = new long[n];
        result[0] = 0;
        //(Xj,Yk)到第i个棋子的距离，(Xi,Yi)与(Xj,Yk)为相同坐标时也要计算，此时他们的距离为0.
        long[][][] distance = new long[n][n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    distance[j][k][i] = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[k]);
                }
            }
            //(Xj,Yk)到所有棋子距离从小到大排序,计算k个棋子最小距离的关键步骤，要理解为什么排序
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    Arrays.sort(distance[j][k], 0, n);
                }
            }
        }
        //k个棋子放置一起所需要的最小距离
        for (i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    long curLength = 0;
                    for (l = 0; l < i + 1; l++) {
                        curLength += distance[j][k][l];
                    }
                    min = Math.min(curLength, min);
                }
            }
            result[i] = min;
        }
        StringBuilder str = new StringBuilder();
        for (i = 0; i < n; i++)
            str.append(result[i] + " ");
        str.deleteCharAt(str.length() - 1);
        System.out.print(str);
    }
}
