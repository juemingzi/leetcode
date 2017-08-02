package com.leetcode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renyali
 * Date: 2017/8/2 13:46
 * Description:
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++) {
            if (haystack.substring(i,i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        ImplementStr implementStr = new ImplementStr();
        String haystack = "abcaf";
        String needle = "caf";
        System.out.println(implementStr.strStr(haystack,needle));
    }
}
