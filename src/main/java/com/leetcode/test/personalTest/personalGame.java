package com.leetcode.test.personalTest;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/31 21:58
 * Description:
 */
public class personalGame {
    public static void testLinkedSet() {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(2);
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
    public static void testLinkHashMap() {
        Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(1,2);
        map.put(3,2);
        map.put(2,5);
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void testHashTable() {
        Map<Integer,Integer> hashTable = new Hashtable<Integer, Integer>();
        // 按key从大到小排序
        hashTable.put(3,5);
        hashTable.put(9,8);
        hashTable.put(5,4);
        Set<Map.Entry<Integer,Integer>> set = hashTable.entrySet();
        for (Map.Entry<Integer,Integer> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void testTreeSet() {
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(9);
        treeSet.add(10);
        treeSet.add(8);
        System.out.println(treeSet.toString());
    }
    public static void testPriority() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(1000,new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        priorityQueue.add(10);
        priorityQueue.add(11);
        priorityQueue.add(2);
        System.out.println(priorityQueue.peek());
    }
    public static void testDictory() {
        int a = 1, b = 12, c = 2, d = 2;
        String as = Integer.toString(a), bs = Integer.toString(b), cs = Integer.toString(c), ds = Integer.toString(d);
        System.out.println(as.compareTo(bs));
        System.out.println(as.compareTo(cs));
        System.out.println(bs.compareTo(cs));
        System.out.println(cs.compareTo(as));
        System.out.println(cs.compareTo(bs));
        System.out.println(cs.compareTo(ds));
    }
    public static void testList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0;i < 10;i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void testStack() {
        Stack<Integer> stack = new Stack<Integer>();
    }
    public static void main(String args[]) {
//        testLinkedSet();
//        testLinkHashMap();
//        testHashTable();
//        testPriority();
//        testTreeSet();
//        testDictory();
        testList();
    }
}
