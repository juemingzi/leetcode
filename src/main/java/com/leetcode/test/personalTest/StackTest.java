package com.leetcode.test.personalTest;

import java.util.Stack;

/**
 * Created by renyali
 * Date: 2017/8/29 20:07
 * Description:
 */
public class StackTest {
    public static void main(String args[]) {
        String s = "{[]()[]}";
        Stack<Character> stack = new Stack<Character>();
        boolean isOk = true;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else if (stack.isEmpty()) {
                    isOk = false;
                    break;
                } else {
                char topChar = stack.pop();
                if (s.charAt(i) == '}' && topChar != '{') {
                    isOk = false;
                    break;
                }
                if (s.charAt(i) == ']' && topChar != '[') {
                    isOk = false;
                    break;
                }
                if (s.charAt(i) == ')' && topChar != '(') {
                    isOk = false;
                    break;
                }
                }
        }
        System.out.println(isOk);
    }
}
