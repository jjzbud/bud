package com.bud.test.jvm;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-08
 */
public class LocalvarGC {
    public void localvarGc1() {
        byte[] a = new byte[6 * 1024 * 1024];//6M
        System.gc();
    }

    public void localvarGc2() {
        byte[] a = new byte[6 * 1024 * 1024];
        a = null;
        System.gc();
    }

    public void localvarGc3() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvarGc4() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c = 10;
        System.gc();

    }

    public void localvarGc5() {
        localvarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalvarGC ins = new LocalvarGC();
        ins.localvarGc1();

        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        //ins.localvarGc2();
        //ins.localvarGc3();
        //ins.localvarGc4();
        //ins.localvarGc5();
    }
}
