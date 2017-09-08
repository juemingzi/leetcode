package com.leetcode.test.hard;

import java.util.List;

/**
 * Created by renyali
 * Date: 2017/8/10 10:09
 * Description:
 */
public class MergeKSortedLists {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 1)
            return null;
        merge(lists,0,lists.length-1);
        return lists[0];
    }

    public static void merge(ListNode[] lists, int start, int end) {
        if (start >= end)
            return;
        int mid = (end + start)/2;
        merge(lists,start,mid);
        merge(lists,mid+1,end);
        partition(lists,start,end,mid);
    }

    public static void partition(ListNode[] lists, int start, int end, int mid) {
        ListNode startNode = lists[start], endNode = lists[mid+1];
        ListNode header = null, node = new ListNode(0);
        if (startNode == null) {
            lists[start] = endNode;
            return;
        }
        if (endNode == null) {
            return;
        }
        header = node;
        while (startNode != null && endNode != null) {
            if (startNode.val <= endNode.val) {
                node.next = startNode;
                startNode = startNode.next;
            }else {
                node.next = endNode;
                endNode = endNode.next;
            }
            node = node.next;
        }
        if (startNode == null) {
            node.next = endNode;
        }
        if (endNode == null) {
            node.next = startNode;
        }
        lists[start] = header.next;
    }
    public static void main(String args[]) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(0);
        ListNode[] lists = {listNode,listNode1};
        ListNode ll = MergeKSortedLists.mergeKLists(lists);
        while (ll != null) {
            System.out.println(ll.val);
            ll = ll.next;
        }
    }
}
