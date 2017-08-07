package com.leetcode.test.midium;

/**
 * Created by renyali
 * Date: 2017/8/7 18:11
 * Description:
 */
public class RemoveNthNode {
    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }
        ListNode node = head,endHead = head,startHead = head;
        int i = 0;
        for (;i<n&&endHead.next!=null;i++) {
            endHead = endHead.next;
        }
        if (i < n-1) {
            return head;
        }
        // 删除的为头
        if (i == n-1) {
            return head.next;
        }
        // 下面的逻辑就不包含删除的点为头的情况
        startHead = startHead.next;
        while(endHead.next != null) {
            node = node.next;
            startHead = startHead.next;
            endHead = endHead.next;
        }
        node.next = startHead.next;
        return head;
    }
}
