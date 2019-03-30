package com.leetcode;

public class leetcode4 {
    public static void main(String[] args) {
        SVNRepo.bad_version=11;
        System.out.println(badVersion(12));
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
}

