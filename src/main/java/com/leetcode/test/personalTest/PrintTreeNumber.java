package com.leetcode.test.personalTest;


import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/29 15:13
 * Description:
 */
public class PrintTreeNumber {
    static class TreeNode implements Comparable{
        private int val;
        private TreeNode left;

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

        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public int compareTo(Object o) {
            if (o instanceof TreeNode) {
                if (((TreeNode) o).val == this.val) {
                    return 0;
                }
                if (((TreeNode) o).val > this.val) {
                    return -1;
                }
                if (((TreeNode) o).val < this.val) {
                    return 1;
                }
            }
            return -1;
        }
    }
    public static void printByCol(int[] num) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        if (num.length == 0) {
            return;
        }
        queue.add(num[0]);
        int i = 0,left,right;
        while(!queue.isEmpty()) {
            System.out.print("  "+queue.poll());
            left = 2 * i + 1;
            right = 2 * i + 2;
            i ++;
            if (left < num.length-1)
                queue.add(num[left]);
            if (right < num.length-1)
                queue.add(num[right]);
        }
    }
    public static void printByColSort(int[] num) {
        TreeSet<Integer> treeSet = null;
        if (num.length == 0) {
            return;
        }
        int start = 0, end = 0;
        while (start < num.length) {
            treeSet = new TreeSet<Integer>();
            if (end >= num.length) {
                end = num.length - 1;
            }
            for (int k=start;k<=end;k++) {
                treeSet.add(num[k]);
            }
            for (Integer integer : treeSet) {
                System.out.print(" " + integer);
            }
            System.out.println();
            start = 2 * start + 1;
            end = 2 * end + 2;
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

    public static void printByColSortNode(TreeNode list) {
        if (list == null) {
            return;
        }
        List<TreeNode> startList = new ArrayList<TreeNode>();
        List<TreeNode> endList = new ArrayList<TreeNode>();
        TreeSet<TreeNode> treeNodes = null;
        startList.add(list);
        while (!startList.isEmpty()) {
            treeNodes = new TreeSet<TreeNode>();
            for (TreeNode treeNode : startList) {
                treeNodes.add(treeNode);
                if (treeNode.left != null) {
                    endList.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    endList.add(treeNode.right);
                }
            }
            for (TreeNode treeNode : treeNodes) {
                System.out.print(" " + treeNode.val);
            }
            System.out.println();
            startList = new ArrayList<TreeNode>();
            startList.addAll(endList);
            endList = new ArrayList<TreeNode>();
        }
    }

    public static void main(String args[]) {
//        int[] num = {1,3,2,4,11,2,7,8,9};
//        printByCol(num);
//        printByColSort(num);

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(14);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = null;
        treeNode3.left = treeNode6;
        treeNode3.right = null;
        treeNode4.left = null;
        treeNode4.right = null;
        treeNode6.left = null;
        treeNode6.right = null;
//        printByColNode(treeNode1);
        printByColSortNode(treeNode1);
    }
}
