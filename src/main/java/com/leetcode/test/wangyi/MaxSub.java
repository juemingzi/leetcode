package com.leetcode.test.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/16 17:26
 * Description:
 */
public class MaxSub {
    public static int maxSum (int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return 0;
        }
        int[] line = new int[nums.length];
        int i = 0;
        int start = 0, end = nums.length - 1;
        int min = nums[0];
        int max = nums[end];
        int sum = nums[end --] - nums[start ++];
        while (start < end) {
            sum += nums[end] - min;
            sum += max - nums[start];
            min = nums[start ++];
            max = nums[end --];
        }
        sum += Math.max(nums[end]-min,max-nums[start]);
        return sum;
    }
    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int[] nums = new int[n];
//        int i = 0;
//        while (i < n && scanner.hasNext()) {
//            nums[i ++] = scanner.nextInt();
//        }
        int[] nums = {2,3,5,7,11,13,17,19};
        System.out.println(maxSum(nums));
    }
}
