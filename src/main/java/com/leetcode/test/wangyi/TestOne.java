package com.leetcode.test.wangyi;

import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/12 14:43
 * Description:
 */
public class TestOne {
    public static void main(String args[]) {
        long x,f,p,d,day;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            x = scanner.nextInt();
            f = scanner.nextInt();
            d = scanner.nextInt();
            p = scanner.nextInt();
//            if (d < x) {
//                System.out.println(0);
//                return;
//            }
            day = (d + (f * p)) / (p + x);
            System.out.println(day);
            return;
        }
    }
}
