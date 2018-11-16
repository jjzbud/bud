package com.bud.test.gc;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-10-25
 */
/**
 * 虚拟机参数：-verbose:gc
 */
public class ReferenceCountingGC1
{
    private Object instance = null;
    private static final int _1MB = 1024 * 1024;

    /** 这个成员属性唯一的作用就是占用一点内存 */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC1 objectA = new ReferenceCountingGC1();
        ReferenceCountingGC1 objectB = new ReferenceCountingGC1();
        objectA.instance = objectB;
        objectB.instance = objectA;
        objectA = null;
        objectB = null;
        System.gc();
    }
}