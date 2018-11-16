package com.bud.test;

import java.util.UUID;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-26
 */
public class UUIDTool {

      /**
     * 自动生成32位的UUid，对应数据库的主键id进行插入用。
     *
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    static volatile int a = 0;
    static volatile int b = 0;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "ss[" + a + "*" + b + "]=====" + getUUID());
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    a(j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        System.out.println(Thread.currentThread().getName() + "ss[" + a + "*" + b + "]=====" + getUUID());

    }

    public static synchronized void a(int j) {
        ++a;
        ++b;
        System.out.println(Thread.currentThread().getName() + "ss[" + a + "*" + b + "*" + j + "]=====" + getUUID());
    }

}
