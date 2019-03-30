package com.leetcode;

public class SVNRepo {
    public static  int bad_version = 12;
    public static boolean isBadVersion(int k) {
        if (k >=bad_version){
            return true;
        }else{
            return false;
        }
    }
}
