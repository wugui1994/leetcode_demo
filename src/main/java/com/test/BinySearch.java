package com.test;

import java.lang.reflect.Array;

public class BinySearch {
    public static void main(String[] args) {
        int[] arrSearch = {1, 2, 3, 5, 6, 35, 88};
        search(arrSearch,arrSearch.length,25);

    }

    private static void search(int[] arrSearch, int length,int target) {
        int start = 0;
        int end = length -1;
        int res = -1;
        while (start<=end){
            int mid=start + ((end-start)>>1);
            if (arrSearch[mid]>=target){
                end = mid -1;
                res = mid;
            }else{
                start = mid +1;
            }
        }
    }
    private static int findLast(int[] array, int target) {
        int left = 0,
                right = array.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(array[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println(left);
        //如果找到target, left指向最后一个target的后一位
        left = left - 1;
        if(left < array.length && array[left] == target)
            return left;
        return -1;
    }

}
