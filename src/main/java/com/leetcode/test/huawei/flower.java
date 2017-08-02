package com.leetcode.test.huawei;

/**
 * Created by renyali
 * Date: 2017/7/6 19:09
 * Description:
 */
public class flower {
    public static void main(String[] args) {
        int i = 100, x, y, z;
        int count = 1;
        int sum = 0;
        for (;i < 1000;i ++) {
            x = i / 100;
            y = i % 100 / 10;
            z = i % 10;
            if (Math.pow(x,3) + Math.pow(y,3) + Math.pow(z,3) == i) {
                System.out.println("第"+count+"个水仙花数："+i);
                count ++;
                sum += i;
            }
        }
        System.out.println("水仙花数总和为："+sum);

    }
}
