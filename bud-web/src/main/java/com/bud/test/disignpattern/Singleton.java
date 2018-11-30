package com.bud.test.disignpattern;

/**
 * 描述:
 *      单例模式
 * @Author jiejz1
 * @Create 2018-11-26
 */
public class Singleton {

    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 静态工程方法，创建实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }




}
