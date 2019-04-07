package com.leetcode;

import java.util.ArrayList;

/**
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 *  思路：
 *    扫描一遍数组，利用主元素出现次数大于一半，即用出现的次数减去未出现的次数，最后还是应该是大于0，一切小于0的都抛弃。最后得到可疑的一个主元素。
 *    再进行一遍遍历，确定可疑主元素的出现次数，大于一半就是主元素。
 */
public class leetcode9 {
    public static void main(String[] args) {
        int arrs[]= {1,1,1,2,2,2,2,3};
        majorNumber(arrs);
    }
    public static void majorNumber(int[] arr) {
        int times = 0;            //定义出现次数
        int mainEl = 0;            //定义可疑主元素
        for (int i = 0; i < arr.length; i++)        //找到可疑主元素
        {
            if (times == 0) {
                mainEl = arr[i];
                times = 1;
                continue;
            }
            if (mainEl == arr[i]) {
                times++;
            } else {
                times--;
            }
        }
        System.out.println(mainEl);
        int num = 0;            //遍历数组，找可疑主元素的出现次数
        for (int i : arr) {
            if (mainEl == i) {
                num++;
            }
        }
        if (num > arr.length / 2)        //大于一半为主元素
        {
            System.out.println("主元素：" + mainEl);
        } else {
            System.out.println("没有主元素");
        }
    }
}
