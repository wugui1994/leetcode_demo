package com.juc;

/**
 * countDownlatch 闭锁 在完成相关的运算时 只有其他的所有线程完成 当前运算完成才能进行其他的相关的操作
 */
public class CounteDownLatchDemo {
    public static void main(String[] args) {

    }
}

class LatchDemo implements Runnable{

    private CounteDownLatch latch;

    public LatchDemo(CounteDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i=0;i<5000;i++){
            System.out.println(i);
        }
    }
}

