package com.bud.test.Thread;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-24
 */
public class TestThread1{
    public static void main(String[] args) {
        Thread1 mTh1=new Thread1("A");
        //Thread1 mTh2=new Thread1("B");
        Thread1 mTh2=mTh1;
        mTh1.start();
        mTh2.run();
    }

}
class Thread1 extends Thread{
    private String name;
    public Thread1(String name) {
        this.name=name;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

