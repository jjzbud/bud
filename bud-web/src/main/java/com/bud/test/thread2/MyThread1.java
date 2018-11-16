package com.bud.test.thread2;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-24
 */
public class MyThread1 extends Thread {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        Thread thread = new MyThread1("world");
        thread.start();
    }
}
