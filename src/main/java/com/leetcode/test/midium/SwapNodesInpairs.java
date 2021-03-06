package com.leetcode.test.midium;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by renyali
 * Date: 2017/8/7 20:45
 * Description:
 */
public class SwapNodesInpairs {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode swap,start,end;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode retHead = head.next;
        while (head.next != null && head.next.next != null) {
            start = head;
            end = head.next;
            head = head.next.next;
            if (head.next != null)
                start.next = head.next;
            else
                start.next = head;
            end.next = start;
        }
        if (head.next != null) {
            start = head;
            end = head.next;
            start.next = null;
            end.next = start;
        }
        return retHead;
    }
    public static void ll() {
        HashMap hashMap = new HashMap();
        hashMap.entrySet();
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,2);
        hashtable.put(2,3);
        hashtable.put(4,4);
        Enumeration enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    public static void main(String args[]) {
        ll();
    }
}
