package com.leetcode;

public class AppMain {
    public static void main(String[] args) {
        long freeMemory = Runtime.getRuntime().freeMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(freeMemory/1024/1024);
        System.out.println(maxMemory/1024/1024);
        leetcode_160 leetcode_160 = new leetcode_160();
    }
}
