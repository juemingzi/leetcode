package com.leetcode.test.midium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renyali
 * Date: 2017/8/4 13:51
 * Description:
 */
public class LetterComPhoneNum {
    public static List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        if (digits == null) {
            return ret;
        }
        StringBuffer sb = new StringBuffer();
        getAllPossibleString(digits,0,sb,ret);
        return ret;
    }
    public static void getAllPossibleString (String s, int si,StringBuffer sb, List<String> ret) {
        if (si == s.length()) {
            String retString = sb.toString();
            if (!retString.trim().equals(""))
                ret.add(retString);
            return;
        }
        String subString = getString(s.charAt(si));
        if (subString != null) {
            for (int i=0;i<subString.length();i++) {
                sb.append(subString.charAt(i));
                getAllPossibleString(s,si+1,sb,ret);
                // 因为此处存在下面的else所以导致stringBuffer里面的变量跟sb不一样所以不能直接删除si位置，会抛出异常
                sb.deleteCharAt(sb.length()-1);
            }
        } else {
            getAllPossibleString(s,si+1,sb,ret);
        }
    }
    public static String getString(Character c) {
        switch (c) {
            case '2' : return "abc";
            case '3' : return "def";
            case '4' : return "ghi";
            case '5' : return "jkl";
            case '6' : return "mno";
            case '7' : return "pqrs";
            case '8' : return "tuv";
            case '9' : return "wxyz";
            default : return null;
        }
    }
    public static void main(String args[]) {
        System.out.println(LetterComPhoneNum.letterCombinations("2134"));
    }
}
