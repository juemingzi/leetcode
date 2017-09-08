package com.leetcode.test.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renyali
 * Date: 2017/8/31 21:23
 * Description:
 */
public class TreeSum {
    public static void treeSum(TreeToList.TreeNode treeNode, int curSum, int sum, List<Integer> list) {
        if (treeNode == null || curSum + treeNode.val > sum) {
            return;
        }
        if (curSum + treeNode.val == sum) {
            list.add(treeNode.val);
            System.out.println(list.toString());
            return;
        }
        curSum += treeNode.val;
        list.add(treeNode.val);
        if (treeNode.left != null) {
            treeSum(treeNode.left,curSum,sum,list);
        }
        if (treeNode.right != null) {
            treeSum(treeNode.right,curSum,sum,list);
        }
        // 此处必不可少，清楚添加的数据
        list.remove(list.size()-1);
    }
    public static void main(String args[]) {
        TreeToList.TreeNode root = new TreeToList.TreeNode(5);
        TreeToList.TreeNode three = new TreeToList.TreeNode(3);
        TreeToList.TreeNode two = new TreeToList.TreeNode(13);
        TreeToList.TreeNode nine = new TreeToList.TreeNode(9);
        TreeToList.TreeNode one = new TreeToList.TreeNode(1);
        root.left = three;
        root.right = two;
        three.left = nine;
        three.right = one;
        nine.left = null;
        nine.right = null;
        one.left = null;
        one.right = null;
        List<Integer> list = new ArrayList<Integer>();
        treeSum(root,0,18,list);
    }
}
