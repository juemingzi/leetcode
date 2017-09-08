package com.leetcode.test.wangyi;

import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/16 15:00
 * Description:
 */
public class ReverseB {
//    public static int[] getReverse(int[] nums) {
//        int[] b = new int[nums.length];
//        for (int i=0;i<nums.length;i++) {
//            b[i] = nums[i];
//            reverse(b,0,i);
//        }
//        return b;
//    }
//    public static void reverse(int[] b, int start,int end) {
//        int swap;
//        while (start < end) {
//            swap = b[start];
//            b[start] = b[end];
//            b[end] = swap;
//            start ++;
//            end --;
//        }
//    }
    public static int[] getReverse(int[] nums) {
        int start = 0, end = nums.length-1;
        int[] b = new int[nums.length];
        for (int i=nums.length-1;i>=0;) {
            b[start ++] = nums[i--];
            if (i >= 0) {
                b[end --] = nums[i --];
            }
        }
        return b;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        int i = 0;
        while (i<n && scanner.hasNext()) {
            nums[i ++] = scanner.nextInt();
        }
        nums = getReverse(nums);
        System.out.print(nums[0]);
        for (int j=1;j<nums.length;j++) {
            System.out.print(" " + nums[j]);
        }
    }
}
