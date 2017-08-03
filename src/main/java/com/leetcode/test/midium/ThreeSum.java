package com.leetcode.test.midium;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/3 15:44
 * Description:
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        List<Integer> list = null;
        if (nums.length < 3) {
            return retList;
        }
        Arrays.sort(nums);
        int start,end,target,sum;
        for (int j=0;j<nums.length-2;j++) {
            if (nums[j] > 0) return retList;
            while(j > 0 && nums[j] == nums[j-1] && j < nums.length-2) {
                j ++;
            }
            if (j == nums.length) {
                return retList;
            }
            target = 0 - nums[j];
            start = j + 1;
            end = nums.length -1;
            while (start < end) {
                sum = nums[start] + nums[end];
                if (sum == target) {
                    list = new ArrayList<Integer>();
                    list.add(nums[j]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    retList.add(list);
                    start ++;
                    end --;
                    while (start < end && nums[start-1] == nums[start]) start ++;
                    while (start < end && nums[end+1] == nums[end]) end --;
                }else if (sum < target) start++;
                else end--;
            }
        }
        return retList;
    }

    public static void main(String args[]) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(nums));
    }
}
