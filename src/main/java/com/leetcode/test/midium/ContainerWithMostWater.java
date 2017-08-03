package com.leetcode.test.midium;

/**
 * Created by renyali
 * Date: 2017/8/3 14:55
 * Description:这个题的关键点不是求面积而是短板理论，好比一桶水可以成多少取决于桶的最短的边
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int area = 0;
        int i = 0, j = height.length-1;
        if (height.length < 2) {
            return 0;
        }
        while (i < j) {
            if (height[i] < height[j]) {
                area = (j - i) * height[i];
                i ++;
            } else {
                area = (j - i) * height[j];
                j --;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
