package com.leetcode.test.offer;

import com.leetcode.test.personalTest.PrintTreeNumber;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by renyali
 * Date: 2017/8/31 20:37
 * Description:
 */
public class TreeMirror {
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
    public static void printByColNode(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode node = null;
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            node = queue.poll();
            System.out.print(" " + node.getVal());
            if (node.left != null) {
                queue.add(node.getLeft());
            }
            if (node.right != null) {
                queue.add(node.getRight());
            }
        }
    }
    public static void getTreeMirror (TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            getTreeMirror(root.left);
        }
        if (root.right != null) {
            getTreeMirror(root.right);
        }
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
        printByColNode(root);
        getTreeMirror(root);
        System.out.println();
        printByColNode(root);
    }
}
