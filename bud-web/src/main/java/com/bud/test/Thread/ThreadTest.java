package com.bud.test.Thread;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-24
 */
public class ThreadTest {

    public static void main(String[] args) {

        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1);

        for (int i = 0; i < 100; i++) {
            //System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 0) {

                //myRunnable1.run();
                //thread.start();
                thread.run();
            }
            if(i == 50){
                //thread.run();
                //myRunnable1.stopThread();
            }
            if(i == 99){
                //myRunnable1.run();
            }
        }
    }
}


class MyRunnable1 implements Runnable {

    private boolean stop;

    @Override
    public void run() {
        for (int i = 0; i < 100 && !stop; i++) {
            System.out.println(Thread.currentThread().getName() + " *** " + i);
        }
    }

    public void stopThread() {
        this.stop = true;
    }

}

