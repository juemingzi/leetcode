package com.leetcode.test.wangyi;

import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/11 14:39
 * Description:
 */
public class topicOne {
    public static int minSum = 0;
    public static int min = Integer.MAX_VALUE;
    public  int minSum(int[] nums) {
        int[] b = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            b[i] = 0;
        }
       gui(nums,b,0);
        return minSum * 1024;
    }
    public  void gui(int[] nums, int[] b,int i) {
        if (i == nums.length) {
            int sumSelect = 0;
            int sumNo = 0;
            for (int j=0;j<nums.length;j++) {
                if (b[j] == 1) {
                    sumSelect += nums[j];
                } else {
                    sumNo += nums[j];
                }
            }
            if (Math.abs(sumSelect-sumNo) < min) {
                min = Math.abs(sumSelect-sumNo);
                if (sumSelect > sumNo) {
                    minSum = sumSelect;
                } else {
                    minSum = sumNo;
                }
            }
            return;
        }
        b[i] = 1;
        gui(nums,b,i+1);
        b[i] = 0;
        gui(nums,b,i+1);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int[] nums = new int[n];
        scanner.nextLine();
        int i = 0;
        while(scanner.hasNextInt() && i < n-1) {
            nums[i++] = scanner.nextInt() / 1024;
        }
        topicOne topicOne = new topicOne();
        System.out.println(topicOne.minSum(nums));
    }
}
