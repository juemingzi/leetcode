package com.leetcode.test.ali;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/25 18:48
 * Description:
 */
public class ALTestOne {
    public static int getMaxSum(List<Integer> list) {
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer integer : list) {

            if (sum < 0) {
                sum = integer;
            } else {
                sum += integer;
            }
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String s = null;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            String[] strings = s.split(" ");
            for (String s1:strings) {
                list.add(Integer.valueOf(s1));
            }
            System.out.println(getMaxSum(list));
        }
    }

}
