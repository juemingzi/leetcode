package com.leetcode.test.personalTest;

/**
 * Created by renyali
 * Date: 2017/8/11 20:41
 * Description:
 */
public class DynamicClass {
    public static int getNum(int[] nums, int totalSum) {
        int[][] c = new int[nums.length+1][totalSum+1];
        for(int i=0;i<=totalSum;i++) {
            c[0][i] = 0;
        }
        for (int i=1;i<=nums.length;i++) {
            c[i][0] = 0;
            for (int weight=1;weight<=totalSum;weight++) {
                // 千万别丢等于号
                if (nums[i-1] <= weight) {
                    if (c[i-1][weight-nums[i-1]] + nums[i-1] > c[i-1][weight]) {
                        c[i][weight] = c[i-1][weight-nums[i-1]] + nums[i-1];
                    } else {
                        c[i][weight] = c[i-1][weight];
                    }
                } else {
                    c[i][weight] = c[i-1][weight];
                }
            }
        }
        for(int i=0;i<nums.length+1;i++) {
            for (int j=0;j<totalSum+1;j++) {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
        return c[nums.length][totalSum];
    }
    public static void main(String args[]) {
        int[]  nums = {3,3,7,3,1};
        int totalSum = 0;
        for (int i=0;i<nums.length;i++) {
            totalSum += nums[i];
        }
        System.out.println(totalSum - DynamicClass.getNum(nums,totalSum/2));
    }
}
