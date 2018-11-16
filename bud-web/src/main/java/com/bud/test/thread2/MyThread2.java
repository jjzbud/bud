package com.bud.test.thread2;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-24
 */
public class MyThread2 implements Runnable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        if(name==null){
           // throw new RuntimeException("错误");
        }
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.setName("world");
        new Thread(myThread).start();
    }
}