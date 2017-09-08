package com.leetcode.test.wangyi;

import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/16 15:26
 * Description:
 */
public class LiveAlone {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x,f,d,p;
        x = scanner.nextInt();
        f = scanner.nextInt();
        d = scanner.nextInt();
        p = scanner.nextInt();
        int day = f;
        int max = d / x;
        int live;
        while (true) {
            if (day * x + (day - f) * p > d) {
                live = day-1;
                break;
            } else if (day * x + (day - f) * p == d) {
                live = day;
                break;
            }
            day ++;
        }
        if (max > f) {
            System.out.println(live);
        } else {
            System.out.println(max);
        }
    }
}
