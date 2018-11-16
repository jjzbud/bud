package com.bud.test.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-25
 */
class Function1 {
    private boolean flag = false;
    Lock lock = new ReentrantLock();
    Condition con = lock.newCondition();

    //子线程要实现的功能
    public void sub() {
        lock.lock();
        try {
            while (flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 1; i++) {
                //for循环内定义子线程的功能,这里简单的假设为打印一句话,主线程同理
                System.out.println("sub" + i);
            }
            flag = true;
            con.signal();
        } finally {
            lock.unlock();
        }
    }

    //主线程要实现的功能
    public synchronized void main() {
        lock.lock();
        try {
            while (!flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("main" + i);
            }
            flag = false;
            con.signal();
        } finally {
            lock.unlock();
        }
    }
}


public class Demo012 {
    public static void main(String[] args) {
        final Function1 f = new Function1();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 50; i++) {
                            f.sub();
                        }
                    }
                }
        ).start();
        for (int i = 0; i < 50; i++) {
            f.main();
        }
    }
}
