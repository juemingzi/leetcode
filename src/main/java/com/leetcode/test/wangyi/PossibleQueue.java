package com.leetcode.test.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by renyali
 * Date: 2017/8/16 13:47
 * Description:
 */
public class PossibleQueue {
    public static String isPossible (int[] nums) {
        if (nums.length < 2) {
            return "Possible";
        }
        Arrays.sort(nums);
        int num = nums[1] - nums[0];
        int flag;
        for (int i=2;i<nums.length;i++) {
            flag = nums[i] - nums[i-1];
            if (flag != num) {
                return "Impossible";
            }
        }
        return "Possible";
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        int i = 0;
        while (scanner.hasNext() && i < n) {
            nums[i ++] = scanner.nextInt();
        }
        System.out.println(isPossible(nums));
    }
}
