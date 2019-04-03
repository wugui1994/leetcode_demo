package com.leetcode;

/**
 * 寻找开发根的数值
 * 分析思路: x的开方根数据在 0-x之间sqrt = x/sqrt
 * 可以使用二分查找方法在 0-x之间查找数据sqrt
 *
 */
public class leetcode6 {
    public static void main(String[] args) {
        System.out.println( sqrt(9));
    }

    /**
     * 使用二分查找查找相关sqrt
     * @param arg 目标数据
     * @return
     */
    public static int sqrt(int arg) {
        int left = 0;
        int right =arg;
        int res = 0;
        while (left<=right){
            int midle = left + ((right-left)>>1);
            if (midle<=arg/midle){
                left = midle + 1;
                res = midle;
            }else{
                right = midle - 1;
            }
        }
        return res;
    }
}
