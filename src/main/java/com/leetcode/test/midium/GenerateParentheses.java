package com.leetcode.test.midium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renyali
 * Date: 2017/8/7 19:13
 * Description:
 */
public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        List<String> list = new ArrayList<String>();
        if (n == 0) {
            return list;
        }
        generate(list,2*n-1,stringBuffer);
        List<String> retList = new ArrayList<String>();
        for (String s : list) {
            if (isTrue(s)) {
                retList.add(s);
            }
        }
        return retList;
    }
    public static void generate(List<String> list, int n, StringBuffer sb) {
        if (n == 0) {
            list.add(sb.toString());
            return;
        }
        sb.append('(');
        generate(list,n-1,sb);
        // 删除 （
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        generate(list,n-1,sb);
        // 删除 ）
        sb.deleteCharAt(sb.length()-1);
    }
    public static boolean isTrue(String s) {
        int countLeft = 0;
        int i = 0;
        if (s != null) {
            while (i < s.length()) {
                if (s.charAt(i) == '(') countLeft ++;
                else if (s.charAt(i) == ')' && countLeft > 0) {
                    countLeft --;
                }
                else return false;
                i ++;
            }
        }
        if (countLeft == 0)
            return true;
        else return false;
    }
    public static void main(String args[]) {
        System.out.println(generateParenthesis(3));
    }
}
