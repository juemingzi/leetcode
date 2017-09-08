package com.leetcode.test.wangyi;

import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/16 14:21
 * Description:
 */
public class LongestQueue {
    public static int longest(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        int i = 0,max = Integer.MIN_VALUE;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s.charAt(i ++));
        while (i < s.length()) {
            if (s.charAt(i) != stringBuffer.charAt(stringBuffer.length()-1)) {
                stringBuffer.append(s.charAt(i));
                i ++;
            } else {
                // 注意这里的赋值判断在else里面，所以需要考虑整个串都符合要求的情况，可以把下面的if转移出去，或者再最后的
                // 返回那里添加判断
                if (stringBuffer.length() > max) {
                    max = stringBuffer.length();
                }
                stringBuffer = new StringBuffer();
                stringBuffer.append(s.charAt(i ++));
            }
        }
        if (max == Integer.MIN_VALUE) {
            return stringBuffer.length();
        }
        return max;
    }
    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String s = scanner.next();
//            System.out.println(longest(s));
//        }
        System.out.println(longest("1010101"));
    }
}
