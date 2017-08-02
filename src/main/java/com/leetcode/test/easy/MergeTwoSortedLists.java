package com.leetcode.test.easy;

/**
 * Created by renyali
 * Date: 2017/8/2 12:18
 * Description:
 */
public class MergeTwoSortedLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0);
        ListNode listNode = header;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
       while (l1 != null && l2 != null) {
           if (l1.val < l2.val) {
               listNode.next = l1;
               listNode = listNode.next;
               l1 = l1.next;
           } else {
               listNode.next = l2;
               listNode = listNode.next;
               l2 = l2.next;
           }
       }
       if (l1 == null) {
            listNode.next = l2;
       } else {
            listNode.next = l1;
       }
        return header.next;
    }
    public static void main(String args[]) {

    }
}
