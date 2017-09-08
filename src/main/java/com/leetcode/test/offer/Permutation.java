package com.leetcode.test.offer;

/**
 * Created by renyali
 * Date: 2017/8/30 20:25
 * Description:
 */
public class Permutation {
    public static void permutation(char[] s,int num) {
        char temp;
        if (num == s.length-1) {
            System.out.println(s);
        } else {
            for(int i=num;i<s.length;i++) {
                temp = s[num];
                s[num] = s[i];
                s[i] = temp;
                permutation(s,num +1);
                temp = s[num];
                s[num] = s[i];
                s[i] = temp;
            }
        }
    }
    public static void main(String args[]) {
//        String s = "abc";
//        char[] c = s.toCharArray();
//        permutation(c,0);
        String a = "123";
        String b = "120";
        System.out.println(a.compareTo(b));
    }
}
