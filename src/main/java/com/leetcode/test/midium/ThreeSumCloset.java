package com.leetcode.test.midium;

import java.util.Arrays;

/**
 * Created by renyali
 * Date: 2017/8/4 12:41
 * Description:此类问题的关键可以先进行排序在选择，这样可以进一步简化问题，并去掉不必要分支计算
 * 注意这类问题用双指针方法可更简便
 */
public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int threeSum, twoSum, twoTarget, oneTarget, flag;
        int i, j, k;
        int min = nums[0] + nums[1] + nums[2];
        for (i=0;i<nums.length-2;i++) {
            twoTarget = target - nums[i];
            if (twoTarget < 0 && nums[i] > 0) {
                threeSum = nums[i] + nums[i+1] + nums[i+2];
                if (Math.abs(target-min) > Math.abs(target-threeSum)) {
                    min = threeSum;
                }
                break;
            }
            for (j=i+1;j<nums.length-1;j++) {
                oneTarget = twoTarget - nums[j];
                for (k=j+1;k<nums.length-1;k++) {
                    flag = oneTarget - nums[k];
                    // 切记此处不能包含等号，因为等号只能说明前后两项相等，但是两项之后还可能存在可取的数值
                    if (Math.abs(flag) < Math.abs(oneTarget - nums[k+1])) {
                        break;
                    }
                }
                threeSum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target-min) > Math.abs(target-threeSum)) {
                    min = threeSum;
                }
            }
        }
        return min;
    }
    public static void main(String args[]) {
        ThreeSumCloset threeSumCloset = new ThreeSumCloset();
        int[] nums = {1,2,4,8,16,32,64,128};
        System.out.println(threeSumCloset.threeSumClosest(nums,82));
    }
}
