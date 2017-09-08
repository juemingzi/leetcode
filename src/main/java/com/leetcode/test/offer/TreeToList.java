package com.leetcode.test.offer;

/**
 * Created by renyali
 * Date: 2017/8/31 20:50
 * Description:
 */
public class TreeToList {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
    public static TreeNode changeTreeToList(TreeNode root, TreeNode treeNodeList) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            treeNodeList = changeTreeToList(root.left,treeNodeList);
        }
        root.left = treeNodeList;
        if (treeNodeList != null) {
            treeNodeList.right = root;
        }
        treeNodeList = root;
        if (root.right != null) {
            treeNodeList = changeTreeToList(root.right,treeNodeList);
        }
        return treeNodeList;
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(5);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode nine = new TreeNode(9);
        TreeNode one = new TreeNode(1);
        root.left = three;
        root.right = two;
        three.left = nine;
        three.right = one;
        nine.left = null;
        nine.right = null;
        one.left = null;
        one.right = null;

        TreeNode treeNodeList = null;
        treeNodeList = changeTreeToList(root,treeNodeList);
        while (treeNodeList != null && treeNodeList.left != null) {
            System.out.print(" "+treeNodeList.getVal());
            treeNodeList = treeNodeList.left;
        }
        System.out.print(" "+treeNodeList.getVal());
    }
}
