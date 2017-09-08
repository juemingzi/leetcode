package com.leetcode.test.wangyi;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/12 14:43
 * Description:
 */
public class TestThree {
    static class ListNode {
        Integer val;
        Integer num;
        ListNode next;

        public ListNode(Integer val, Integer num) {
            this.val = val;
            this.num = num;
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testNum = scanner.nextInt();
        scanner.nextLine();
        int j,n,key,value;
        ListNode head,node;
        List<ListNode> ret;
        StringBuffer stringBuffer = new StringBuffer("&");
        for (int i=0;i<testNum;i++) {
            n = scanner.nextInt();
            j = 0;
            scanner.nextLine();
            ret = new ArrayList<ListNode>();
            while (j < n-1 && scanner.hasNext()) {
                key = scanner.nextInt();
                value = scanner.nextInt();
                node = new ListNode(key,value);
                ret.add(node);
                scanner.nextLine();
                j++;
            }
            isOK(ret,stringBuffer);
        }
        String[] s = stringBuffer.toString().split("&");
        for (int i=1;i<s.length;i++) {
            System.out.println(s[i]);
        }
    }
    public static void isOK(List<ListNode> list, StringBuffer stringBuffer) {

    }
}
