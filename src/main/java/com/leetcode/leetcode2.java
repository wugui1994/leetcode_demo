package com.leetcode;

/**
 * 你给出一个整数数组(size为n)，其具有以下特点：

 相邻位置的数字是不同的
 A[0] < A[1] 并且 A[n - 2] > A[n - 1]
 假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。

 */
public class leetcode2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 4, 5, 7, 6};
        int search = binarySearch(arr);
        System.out.println(search);
    }

    /**\
     * 暂时的想法
     * @param arr
     * @return
     */
    private static int binarySearch(int[] arr) {
        if (arr.length < 3){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        //1, 2, 1, 3, 4, 5, 7, 6
        int mid = start + (end - start) / 2;

        for (int i = 1; i < arr.length; i++) {
            if (i != arr.length - 1) {
                if (arr[i] < arr[i + 1] && arr[i + 1] > arr[i - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
