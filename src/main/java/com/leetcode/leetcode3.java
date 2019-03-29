package com.leetcode;

public class leetcode3 {
    public static void main(String[] args) {
        int arrs[]= {1,4,4,5,7,7,8,9,9,10};
        System.out.println(firstSeaech(arrs, 4));

    }

    /**
     * 返回数组的第一个位置
     * @param arrs
     * @param i 目标元素
     * @return
     */
    private static int firstSeaech(int[] arrs, int i) {
        int left = 0;
        int right = arrs.length - 1;
        int index=-1;
        while (left<=right){
            int mid = left + (right - left) /2;
            if (arrs[mid]<i){
                left = mid +1;
            }else if (arrs[mid]>i){
                right = mid -1;
            }else{
                index = mid;
                break;
            }
        }
       return index;
    }
}
