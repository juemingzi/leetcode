package com.leetcode.test.easy;

/**
 * Created by renyali
 * Date: 2017/8/2 15:43
 * Description:
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == target || nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String args[]) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,2,3,5};
        System.out.println(searchInsertPosition.searchInsert(nums,4));
    }
}
