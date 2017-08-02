package com.leetcode.test.huawei;

import java.util.Scanner;
/**
 * Created by renyali
 * Date: 2017/7/6 20:51
 * Description:
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
