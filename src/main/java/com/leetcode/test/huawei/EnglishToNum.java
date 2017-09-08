package com.leetcode.test.huawei;

import java.util.*;

/**
 * Created by renyali
 * Date: 2017/8/30 19:35
 * Description:
 */
public class EnglishToNum {
    public static List<String> splitByUp(String s) {
        List<String> ret = new ArrayList<String>();
        int index = 0;
        for (int i=1;i<s.length();i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                ret.add(s.substring(index,i));
                index = i;
            } else if (i == s.length() - 1) {
                ret.add(s.substring(index,i + 1));
            }
        }
        return ret;
    }
    public static List<String> changeToNum(String s) {
        Map<String,String> hashMap = getMap();
        boolean isDouble = false;
        List<String> englishNum = splitByUp(s);
        List<String> nums = new ArrayList<String>();
        for (String num : englishNum) {
            if (num.equals("Double")) {
                isDouble = true;
            }else if (hashMap.get(num) == null) {
                return null;
            }else if (isDouble) {
                nums.add(hashMap.get(num));
                nums.add(hashMap.get(num));
                isDouble = false;
            } else {
                nums.add(hashMap.get(num));
            }
        }
        return nums;
    }
    public static  Map<String,String> getMap() {
        Map<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("One","Yi");
        hashMap.put("Two","Er");
        hashMap.put("Three","San");
        hashMap.put("Four","Si");
        hashMap.put("Five","Wu");
        hashMap.put("Six","Liu");
        hashMap.put("Seven","Qi");
        hashMap.put("Eight","Ba");
        hashMap.put("Nine","Jiu");
        hashMap.put("Zero","Ling");
        return hashMap;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String englishNumber = scanner.nextLine();
        List<String> nums = changeToNum(englishNumber);
        if (nums == null) {
            return;
        }
        for (String s : nums) {
            System.out.print(s);
        }
    }
}
