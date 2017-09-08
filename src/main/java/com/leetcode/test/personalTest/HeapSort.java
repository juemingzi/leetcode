package com.leetcode.test.personalTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by renyali
 * Date: 2017/8/12 14:09
 * Description:
 */
public class HeapSort {
    public static void minHeap(int[] nums, int place) {
        int left = 2 * place + 1;
        int right = 2 * place + 2;
        int largest = place;
        int swap = nums[place];
        if (left < nums.length && nums[left] < nums[place]) {
            largest = left;
        }
        if (right < nums.length && nums[right] < nums[largest]) {
            largest = right;
        }
        if (largest != place) {
            nums[place] = nums[largest];
            nums[largest] = swap;
            minHeap(nums,largest);
        }
    }

    public static void heap(int[] nums) {
        int num = nums.length / 2 - 1;
        for (int i=num;i>=0;i--) {
            minHeap(nums,i);
        }
    }
    public static void main(String args[]) {
//        int[] nums = {9,3,4,1,0};
//        heap(nums);
//        for (int i=0;i<nums.length;i++) {
//            System.out.print("  " + nums[i]);
//        }
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String str;
            try {
                str = stdin.readLine();
                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
