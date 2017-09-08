package com.leetcode.test.toutiao;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/22 18:51
 * Description:
 */
public class TTOne {
    public static void getCollection(int[] x, int[] y, Hashtable hashtable) {
        int n = x.length;
        int xNumber,yNumber;
        for (int i=0;i<n;i++) {
            xNumber = x[i];
            yNumber = y[i];
            int j=0;
            for (;j<n;j++) {
                if (x[j] > xNumber && y[j] >yNumber) {
                    break;
                }
            }
            if (j == n) {
                hashtable.put(xNumber,yNumber);
            }
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int i = 0;
        scanner.nextLine();
        while(i < n && scanner.hasNext()) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            i ++;
            scanner.nextLine();
        }
        Hashtable<Integer,Integer> hashtable = new Hashtable<Integer, Integer>();
        getCollection(x,y,hashtable);
        Set<Integer> set =  hashtable.keySet();
        Object[] list = set.toArray();
        int j;
        for (int num=list.length-1;num>=0;num--) {
            j = (Integer) list[num];
            System.out.println(j + " "+hashtable.get(j));
        }
    }
}
