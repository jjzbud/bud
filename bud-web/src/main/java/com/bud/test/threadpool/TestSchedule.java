package com.bud.test.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-30
 */
public class TestSchedule {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

        for(int i=0;i<22;i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);

            System.out.println("线程池中线程数目："+executor.toString());
        }
       /* executor.shutdown();
        executor.isShutdown();*/

    }
}
