package com.bud.test.thread2;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-25
 */

/**
 * 设计四个线程,其中两个线程每次对变量i加1,另外两个线程每次对i减1.
 *
 * @author Administrator
 */
public class Demo02 {

    private int i = 0;

    public static void main(String[] args) {
//        Demo02 demo = new Demo02();
//        Add add = demo.new Add();
//        Sub sub = demo.new Sub();
//        for (int i = 1; i <= 2; ++i) {
////            new Thread(add, "线程" + i).start();
////            new Thread(sub, "线程" + i).start();
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 2; i++) {
//            System.out.println(i);
//        }
    }


    //定义一个内部类Add,实现功能每次对i加一
    class Add implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                addOne();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //定义一个内部类Sub,实现功能每次对i减1
    class Sub implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                subOne();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void addOne() {
        i++;
        System.out.println(Thread.currentThread().getName() + "加一的值为:" + i);
    }

    public synchronized void subOne() {
        i--;
        System.out.println(Thread.currentThread().getName() + "减一的值为:" + i);
    }
}
