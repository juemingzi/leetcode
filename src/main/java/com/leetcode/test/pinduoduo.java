package com.leetcode.test;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/9/2 15:16
 * Description:
 */
public class pinduoduo {
    static class TreeNode implements Comparable<TreeNode> {
        String name;
        // 代表父节点
        int val;
        TreeSet<TreeNode> treeNodes;
        public TreeNode() {}
        public TreeNode(String name, int val) {
            this.name = name;
            this.val = val;
        }
        public int compareTo(TreeNode o) {
            return this.name.compareTo(o.name);
        }
    }

    public static void printTreeNode(TreeNode treeNode, int count, boolean haveP, boolean isLast, boolean isPLast) {
        if (treeNode == null) {
            return;
        }
        int con;
        if (count >= 1) {
            if (haveP && count >= 2 && !isPLast) {
                con = count-2;
            } else {
                con = count -1;
            }
            for (int i=0;i<con;i++) {
                System.out.print("   ");
            }
            if (haveP && count >= 2 && !isPLast) {
                System.out.print("|  ");
            }
            if (isLast) {
                System.out.print("、—— ");
            } else {
                System.out.print("|—— ");
            }
        }
        System.out.println(treeNode.name);
        if (treeNode.treeNodes == null) {
            return;
        }
        Iterator<TreeNode> iterator = treeNode.treeNodes.iterator();
        int size = treeNode.treeNodes.size();
        int num = 0;
        while(iterator.hasNext()) {
            if (num == size-1) {
                if (isLast) {
                    printTreeNode(iterator.next(),count+1,true,true,true);
                } else {
                    printTreeNode(iterator.next(), count + 1, true, true, false);
                }
            } else {
                if (isLast) {
                    printTreeNode(iterator.next(),count+1,true,false,true);
                } else {
                    printTreeNode(iterator.next(),count+1,true,false,false);
                }
            }
            num ++;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeNode treeNode = null;
        Map<Integer,TreeNode> hashMap = new HashMap<Integer, TreeNode>();
        scanner.nextLine();
        int i = 0;
        while(i < n && scanner.hasNext()) {
            treeNode = new TreeNode();
            treeNode.name = scanner.next();
            treeNode.val = scanner.nextInt();
            treeNode.treeNodes = null;
            hashMap.put(i++,treeNode);
            // 父节点不存在
            if (treeNode.val != -1 && !hashMap.containsKey(treeNode.val)) {
                return;
            }
            if (hashMap.get(treeNode.val) != null) {
                TreeNode pNode = hashMap.get(treeNode.val);
                TreeSet<TreeNode> set = pNode.treeNodes;
                if (set == null) {
                    set = new TreeSet<TreeNode>();
                }
                set.add(treeNode);
                pNode.treeNodes = set;
            }
        }
        TreeNode root = hashMap.get(0);
        printTreeNode(root,0,false,false,false);
    }
}
