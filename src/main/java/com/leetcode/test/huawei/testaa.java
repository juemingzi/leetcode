package com.leetcode.test.huawei;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by renyali
 * Date: 2017/7/6 19:40
 * Description:
 */
public class testaa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = "--.#.#-.-";
        String s = "";
        while (in.hasNextLine()) {
//            System.out.println("sss   " + in.nextLine());
            s = in.nextLine();
        }
        System.out.println("s" + s);
        if (s.contains(".") || s.contains("-")) {
            String[] str = s.split("#");
            if (str.length < 1) {
                System.out.println("ERROR");
            }
            List<Integer> num = new ArrayList();
            for (String s1 : str) {
                if (s1.equals("")) {
                    continue;
                }
                int sum = 0;
                for (int i=0;i<s1.length();i++) {
                    Integer number = getNumber(s1.charAt(i));
                    if (number == null) {
                        System.out.println("ERROR");
                        return;
                    }
                    sum += Math.pow(2,s1.length()-1-i) * number;
                }
                if (sum > 51) {
                    System.out.println("ERROR");
                    return;
                }
                num.add(sum);
            }
            if (num.size() < 1) {
                System.out.println("");
                return;
            }
            System.out.println(getString(num));
        }
    }
    public static Integer getNumber(char c) {
        if (c == '.') {
            return 1;
        }else if (c == '-') {
            return 0;
        }else {
            return null;
        }
    }
    public static String getString(List<Integer> list) {
        String ret = "";
        for (Integer integer : list) {
            ret += getRet(integer);
        }
        return ret;
    }
    public static String getRet(Integer integer) {
        switch (integer) {
            case 0 : return "F";
            case 1 : return "G";
            case 2 : return "R";
            case 3 : return "S";
            case 4 : return "T";
            case 5 : return "L";
            case 6 : return "M";
            case 7 : return "N";
            case 8 : return "O";
            case 9 : return "P";
            case 10 : return "Q";
            case 11 : return "W";
            case 12 : return "X";
            case 13 : return "Y";
            case 14 : return "Z";
            case 15 : return "U";
            case 16 : return "A";
            case 17 : return "G";
            case 18 : return "H";
            case 19 : return "I";
            case 20 : return "J";
            case 21 : return "K";
            case 22 : return "B";
            case 23 : return "C";
            case 24 : return "D";
            case 25 : return "E";
            case 26 : return "I";
            case 27 : return "m";
            case 28 : return "n";
            case 29 : return "o";
            case 30 : return "p";
            case 31 : return "i";
            case 32 : return "j";
            case 33 : return "k";
            case 34 : return "f";
            case 35 : return "g";
            case 36 : return "h";
            case 37 : return "a";
            case 38 : return "b";
            case 39 : return "c";
            case 40 : return "d";
            case 41 : return "e";
            case 42 : return "q";
            case 43 : return "r";
            case 44 : return "w";
            case 45 : return "x";
            case 46 : return "y";
            case 47 : return "z";
            case 48 : return "s";
            case 49 : return "t";
            case 50 : return "u";
            case 51 : return "v";
        }
        return null;
    }
}
