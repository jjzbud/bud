package com.bud.test.threadpool;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-30
 */
public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 100, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(100));

        for(int i=0;i<22;i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);

            System.out.println("线程池中线程数目："+executor.getPoolSize()
                    +"，队列中等待执行的任务数目："+executor.getQueue().size()
                    +"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
        executor.isShutdown();
    }
}


class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕"+Thread.currentThread().getName());
    }
}
