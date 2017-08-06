package com.leetcode.test.midium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by renyali
 * Date: 2017/8/4 15:14
 * Description:只要第一个不一样就都不一样了，对于第二个数字不用去重
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        List<Integer> list = null;
        boolean flag = false;
        Arrays.sort(nums);
        int start, end, sum;
        if (nums.length >= 4) {
            for (int j=0;j<nums.length-3;j++) {
                if (target-nums[j] < 0 && nums[j] > 0) {
                    return retList;
                }
                while(j > 0 && nums[j] == nums[j-1] && j<nums.length-3) {
                    j ++;
                }
                for (int i=j+1;i<nums.length-2;i++) {
                    while(flag && i > j+1 && nums[i] == nums[i-1] && i < nums.length-2) i++;
                    start = i + 1;
                    end = nums.length - 1;
                    while(start < end) {
                        sum = nums[i] + nums[start] + nums[end] + nums[j];
                        if (sum == target) {
                            list = new ArrayList<Integer>();
                            list.add(nums[j]);
                            list.add(nums[i]);
                            list.add(nums[start]);
                            list.add(nums[end]);
                            retList.add(list);
                            start ++;
                            end --;
                            while (start < end && nums[start] == nums[start-1]) start ++;
                            while (start < end && nums[end] == nums[end+1]) end --;
                        } else if (sum > target) {
                            end --;
                        } else {
                            start ++;
                        }
                    }
                    // 只要还在这个循环里面就是说明第一个数字是一样的，这时候就要判断第二个数字是否跟之前的一样
                    flag = true;
                }
                // 只要跳出这个循环就说明第一个数字不一样了，所以第二个数字不用判断是否跟前面一样
                flag = false;
            }
        }
        return retList;
    }
}
