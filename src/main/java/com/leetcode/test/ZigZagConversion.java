package com.leetcode.test;

/**
 * Created by renyali
 * Date: 2017/7/4 10:34
 * Description:该类问题的关键点在于它的数字规律，找到规律后问题就好解决了
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        String ret = null;
        if (s == null || numRows <= 1 || s.length() <= 2) {
            return s;
        }
        int space = 0;
        int flagSpace = 2 * (numRows - 1);
        int i = 0, j = 0;
        ret = String.valueOf(s.charAt(i));
        for (;i < numRows && i < s.length();i ++) {
            if (i != 0) {
                ret += s.charAt(i);
            }
            space = (numRows - i - 1) * 2;
            // 最后一行
            if (space == 0) {
                space = flagSpace;
            }
            for (j = i + space;j < s.length(); j += space) {
                // 第一行space == flagSpace
                if (space != flagSpace) {
                    space = flagSpace - space;
                }
                ret += s.charAt(j);
            }
        }
        return ret;
    }
    public static void main(String args[]) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        String ret = zigZagConversion.convert(s,4);
        System.out.println(ret);
//        System.out.println(ret.equals("PAHNAPLSIIGYIR"));
//        System.out.print(s.charAt(0));
    }
}
