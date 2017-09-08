package com.leetcode.test.personalTest;

/**
 * Created by renyali
 * Date: 2017/8/12 13:27
 * Description:
 */
public class QuickSort {
    public static int partition(int[] nums, int start, int end) {
        int key = nums[end];
        int i = start-1, j = start;
        int swap;
        for (;j<end;j++) {
            if (nums[j] <= key) {
                i = i+1;
                swap = nums[j];
                nums[j] = nums[i];
                nums[i] = swap;
            }
        }
        nums[end] = nums[i+1];
        nums[i+1] = key;
        return i+1;
    }
    public static void quickSort(int[] nums,int start, int end) {
        if (start > end) {
            return;
        }
        int p = partition(nums,start,end);
        quickSort(nums,start,p-1);
        quickSort(nums,p+1,end);
    }
    public static void main(String args[]) {
        int[] nums = {7,2,3,21,9,0,0};
        quickSort(nums,0,nums.length-1);
        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}
