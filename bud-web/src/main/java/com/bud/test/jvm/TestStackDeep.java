package com.bud.test.jvm;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-08
 */
public class TestStackDeep {
    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling =" + count);
            e.printStackTrace();
        }
    }
}
