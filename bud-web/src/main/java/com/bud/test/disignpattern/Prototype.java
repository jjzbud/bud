package com.bud.test.disignpattern;

/**
 * 描述:
 *      原形模式
 *
 *
 * @Author jiejz1
 * @Create 2018-11-26
 */
public class Prototype implements Cloneable {


    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }


}
