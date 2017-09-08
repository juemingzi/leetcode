package com.leetcode.test.offer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by renyali
 * Date: 2017/8/31 20:09
 * Description:
 */
public class SubTreeNode {
    static class TreeNode {
        int val;
        TreeNode leftChild;
        TreeNode rightChild;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static boolean checkSub(TreeNode root, TreeNode sub) {
        boolean result = false;
        if (root != null && sub != null) {
            if (root.val == sub.val) {
                result = isSub(root,sub);
            }
            if (!result) {
                result = checkSub(root.leftChild,sub);
            }
            if (!result) {
                result = checkSub(root.leftChild,sub);
            }
        }
        return result;
    }
    public static boolean isSub(TreeNode root, TreeNode sub) {
        if (sub == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.val != sub.val) {
            return false;
        }
        return isSub(root.leftChild,sub.leftChild) && isSub(root.rightChild,sub.rightChild);
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode nine = new TreeNode(9);
        TreeNode one = new TreeNode(1);
        root.leftChild = three;
        root.rightChild = two;
        three.leftChild = nine;
        three.rightChild = one;
        nine.leftChild = null;
        nine.rightChild = null;
        one.leftChild = null;
        one.rightChild = null;
        TreeNode subTree = new TreeNode(3);
        subTree.leftChild = nine;
        subTree.rightChild = null;
        System.out.println(checkSub(root,subTree));
    }

}
