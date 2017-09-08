package com.leetcode.test.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/16 15:46
 * Description:
 */
public class Step {
    public static int[] getStep(int[] c) {
        Arrays.sort(c);
        int[] step = new int[c.length];
        step[0] = 0;
        int min, end;
        for (int num=1;num<c.length;num++) {
            min = Integer.MAX_VALUE;
            for (int start=0;start<c.length-num;start ++) {
               end = start + num;
               int point = (c[start] + c[end]) / 2;
               int less;
               if ((end - start + 1) % 2 == 1 ) {
                   less = (end - start + 1) / 2;
               } else {
                   if (Math.abs(c[(end - start + 1) / 2] - point) < Math.abs(c[(end - start + 1) / 2 - 1] - point)) {
                       less = (end - start + 1) / 2;
                   } else {
                       less = (end - start + 1) / 2 -1;
                   }
               }
               int sum = 0;
               for (int i=start;i<=end;i++) {
                   sum += Math.abs(c[i] - c[less]);
                   if (c[i] - c[less] == 0 && i != less) {
                       sum += 2;
                   }
               }
               if (sum < min) {
                   min = sum;
               }
            }
            step[num] = min;
        }
        return step;
    }
    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int[] x = new int[n];
//        int i = 0;
//        while (i<n && scanner.hasNext()) {
//            x[i ++] = scanner.nextInt();
//        }
//        i = 0;
//        int[] y = new int[n];
//        int[] c = new int[n];
//        while (i<n && scanner.hasNext()) {
//            y[i] = scanner.nextInt();
//            c[i] = x[i] + y[i];
//            i ++;
//        }
        int[] c = {29,31,29,31};
        int[] step = getStep(c);
        System.out.print(step[0]);
//        for (i=1;i<n;i++) {
//            System.out.print(" " + step[i]);
//        }
        for (int i=1;i<4;i++) {
            System.out.print(" " + step[i]);
        }
    }
}
