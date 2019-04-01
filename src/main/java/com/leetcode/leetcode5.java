package com.leetcode;

import java.lang.reflect.Array;

/**
 * 给出[4,5,6,7,0,1,2]  返回 0
 * 二分排序查找
 */
public class leetcode5 {
    public static void main(String[] args) {

        int arrs[]= {4,5,6,7,1,2,3};
        search_min(arrs);

    }

    public static int serach_reverse(int[] args) {
        int left = 0;
        int right = args.length - 1;
        int targert=args[left];
        while (left < right) {
            int middle = left + (right - left) / 2;
            //没有进行反转的情况下
            if (args[left] < args[middle] && args[right] > args[middle]) {
                return args[0];
            }
            //进行数据的反转比较操作
            else if (args[right] > args[middle]) {
                left = middle;
            }else if (args[middle]>args[right]){
                right = middle;
            }else {
                middle =middle-1;
            }
        }
       if (args[right]<=targert){
            return args[left];
       }else {
           return targert;
       }

    }

    /**
     * 1.数组顺序正常的
     * 2.数组不正常顺序
     * 3.数组顺序不正常 大小位置颠倒
     * @param args
     * @return
     */
    public static int search_min(int[] args) {
        if (args==null || args.length == 0){
            return -1;
        }
        int left=0;
        int right=args.length-1;
        int target = args[left];
        while (left+1<right){
            int mid = (left+right)/2;
            if (args[mid]>=target){
                left=mid;
            }else{
                right = mid;
            }
        }
        if (args[right]<=target){
            return args[right];
        }else {
            return target;
        }
    }
}
