package com.leetcode.test.offer;

/**
 * Created by renyali
 * Date: 2017/8/31 21:28
 * Description:
 */
public class TreeDepth {
    public static int getDepth (TreeToList.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
    public static void main(String args[]) {
        TreeToList.TreeNode root = new TreeToList.TreeNode(5);
        TreeToList.TreeNode three = new TreeToList.TreeNode(3);
        TreeToList.TreeNode two = new TreeToList.TreeNode(2);
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
        int depth = getDepth(root);
        System.out.println(depth);
    }
}
