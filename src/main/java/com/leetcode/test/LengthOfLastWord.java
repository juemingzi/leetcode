package com.leetcode.test;

/**
 * Created by renyali
 * Date: 2017/8/2 16:41
 * Description:
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        // 注意split的用法
        String[] str = s.split(" ");
        System.out.println(str.length);
        for (int i= str.length-1;i>=0;i--) {
            System.out.println(str[i]);
            if (!str[i].equals(" ")) {
                return str[i].length();
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("a "));
    }
}
