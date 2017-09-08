package com.leetcode.test.ali;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/26 15:42
 * Description:
 */
public class TopK {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String sIn = null;
        List<Integer> listIn = new ArrayList<Integer>();
        int key;
        while (scanner.hasNext()) {
            sIn = scanner.nextLine();
            String[] sNumber = sIn.split(" ");
            for (String s : sNumber) {
                listIn.add(Integer.valueOf(s));
            }
            key = scanner.nextInt();
            Collections.sort(listIn);
            int num = listIn.get(listIn.size()-key);
            System.out.println("输出第K大的数，本例为第" + key + "大数：" + num);
        }
    }
}
