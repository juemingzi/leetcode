package com.leetcode.test.hard;

import java.util.Random;

/**
 * Created by renyali
 * Date: 2017/8/10 14:06
 * Description:
 */
public class ReverseNodesInKGroup {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k < 2) {
            return head;
        }
        int num = 0, count = 0;
        ListNode node = new ListNode(0);
        ListNode startNode = head,endNode,header;
        header = node;
        while(startNode != null) {
            startNode = startNode.next;
            count ++;
        }
        if (count < k) {
            return head;
        }
        while(true) {
            startNode = head;
            endNode = head;
            num = 0;
            for (;num<k-1&&head!=null;num++) {
                endNode = head.next;
                head = head.next;
            }
            if (num < k-1 || head == null) {
                node.next = startNode;
                break;
            }
            head = head.next;
            reverse(startNode,endNode);
            node.next = endNode;
            node = startNode;
        }
        return header.next;
    }
    public void reverse(ListNode start, ListNode end) {
        ListNode mid,node;
        // 因为至少是两个逆序，所以start的next肯定不是空
        if (start.next.next == null) {
            start.next = null;
            end.next = start;
            return;
        }
        mid = start.next;
        node = start.next;
        start.next = null;
        while(node != end) {
            node = node.next;
            mid.next = start;
            start = mid;
            mid = node;
        }
        node.next = start;
    }
    public static void main(String args[]) {
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

        ListNode node = new ListNode(21);
        ListNode param = node;
        for (int i=0;i<2;i++) {
            ListNode listNode = new ListNode(i);
            node.next = listNode;
            node = node.next;
        }
        node = param;
        while (node != null) {
            System.out.print("    "+node.val);
            node = node.next;
        }
        System.out.println();
        ListNode listNode = reverseNodesInKGroup.reverseKGroup(param,2);
        while (listNode != null) {
            System.out.print("    "+listNode.val);
            listNode = listNode.next;
        }
    }
}
