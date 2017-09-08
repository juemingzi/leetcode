package com.leetcode.test.wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by renyali
 * Date: 2017/8/16 13:24
 * Description:
 */
public class BeautifulBlock {
    public static int getNum(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        Set<Character> set = new HashSet<Character>();
        for (int i=0;i<s.length();i++) {
            set.add(s.charAt(i));
        }
        if (set.size() == 1) {
            return 1;
        }
        if (set.size() == 2) {
            return 2;
        }
        else {
            return 0;
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.next();
            int count = getNum(s);
            System.out.println(count);
        }
    }
}
