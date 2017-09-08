package com.leetcode.test.toutiao;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by renyali
 * Date: 2017/8/22 18:51
 * Description:
 */
public class TTTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int len = in.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
            int[] x = new int[len];
            int[] y = new int[len];

            for (int i = 0; i < len; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                map.put(x[i], y[i]);
            }

            for (int i = 0; i < len; i++) {

                for (int j = i + 1; j < len; j++) {
                    if (x[j] > x[i] && y[j] > y[i]) {
                        map.remove(x[i]);
                    } else if (x[i] > x[j] && y[i] > y[j]) {
                        map.remove(x[j]);
                    }
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
