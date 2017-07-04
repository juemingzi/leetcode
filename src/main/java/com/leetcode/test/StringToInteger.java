package com.leetcode.test;

/**
 * Created by renyali
 * Date: 2017/7/4 16:26
 * Description: 对于这种越界的问题，需要定义一个返回比题目更大的变量，这样易于判断，否则判断较困难，且不易控制
 */
public class StringToInteger {
    public int myAtoi(String str) {
        double ret =0;
        boolean flag = true;
        int i = 0;
        if (str == null || str.equals("")) {
            return 0;
        }
        str = str.trim();
        if (str.charAt(i) == '-') {
            flag = false;
            i ++;
        }else if (str.charAt(i) == '+') {
            flag = true;
            i ++;
        }
        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ret = ret * 10 + (str.charAt(i) - '0');
            } else {
                break;
            }
            i ++;
        }
        if (!flag) {
            ret = -ret;
        }
        if (ret < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (ret > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) ret;
    }
    public static void main (String args[]) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.print(stringToInteger.myAtoi("-2147483639"));
    }
}
