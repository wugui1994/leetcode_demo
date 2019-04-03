package com.leetcode;

public class leetcode4 {
    public static void main(String[] args) {
//        SVNRepo.bad_version=11;
//        System.out.println(badVersion(12));
        int arrs[]= {1,2,2,2,2,3,3,3,4,5};
        System.out.println(findlastPosition(arrs,2));
        System.out.println(findfirstPosition(arrs,2));
    }

    public static int badVersion(int n) {
        int l=1;
        int r = n;
        int index = -1;
        while (l<r){
            int mid = l+ (r-l)/2;
            if (SVNRepo.isBadVersion(mid)){
                index  = mid;
                break;
            }else {
                l=mid + 1;
            }
        }
        return index;
    }

    /**
     * 查找最后一个位置
     * @param nums
     * @param target
     * @return
     */
    public static int findlastPosition(int[] nums,int target) {
            if (nums.length<2) {
                return -1;
            }
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + ((right - left) / 2);
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        return -1;
    }

    /**
     * 查找第一个位置
     * @param nums
     * @param target
     * @return
     */
    public static int findfirstPosition(int[] nums,int target) {
            int left = 0;
            int right = (nums).length - 1;
            while (left <= right){
                int mid = left + ((right-left) >> 1);
                if (target <= nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            if (nums[left] == target){
                return left;
            }else{
                return -1;
            }
    }
}

