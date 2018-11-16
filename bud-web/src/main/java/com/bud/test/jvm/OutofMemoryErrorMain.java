package com.bud.test.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-08
 */
public class OutofMemoryErrorMain {
    int threadCount = 0;

    public OutofMemoryErrorMain() {
    }

    public void addNewThread(){
        while (true) {
            threadCount++; //线程的数量
            new Thread(()->{
                //线程执行不能停
                String a = "线程执行不能停";
                List list = new ArrayList();
                while(true){
                    list.add(a);
                }
            }).start();
        }
    }

    public static void main(String[] args){
        OutofMemoryErrorMain ome = new OutofMemoryErrorMain();
        try {
            ome.addNewThread();
        }catch (Throwable e){
            System.out.println(ome.threadCount);
            e.printStackTrace();
        }
    }
}
