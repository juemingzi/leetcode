package com.leetcode.test.offer;

/**
 * Created by renyali
 * Date: 2017/8/31 19:50
 * Description:
 */
public class Print1ToMaxN {
    public static void printNum(int[] nums) {
        boolean beginZero = true;
        for (int i=0;i<nums.length;i++) {
            if (beginZero && nums[i] != 0) {
                beginZero = false;
                System.out.print(nums[i]);
            } else if (!beginZero) {
                System.out.print(nums[i]);
            }
        }
        System.out.print("\t");
    }
    public static void getMaxNum(int[] nums,int index) {
        if (index == nums.length) {
            printNum(nums);
            return;
        }
        for (int i=0;i<10;i++) {
            nums[index] = i;
            getMaxNum(nums,index + 1);
        }
    }
    public static void main(String args[]) {
        int n = 3;
        int[] nums = new int[n];
        getMaxNum(nums,0);
    }
}
