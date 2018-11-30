package com.bud.test.disignpattern;

/**
 * 描述:
 *  桥接模式（Bridge[brɪdʒ])
 *      桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 *      桥接的用意是： 将抽象化与现实化解耦，使得二占可以独立变化，
 *      像我们常用的JDBC与DriverManager一样，JDBC进行连接数据库的时候，在各个数据库之间进行切换，
 *      基本不需要动太多的代码，甚至丝毫不用动，原因就是JDBC提供统一接口，每个数据库提供各自的实现
 *      用一个叫数据库驱动的程序来桥接就行了。
 *
 */
public class TestBridge {
    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        BridgeSourceable source1 = new SourceSubA();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        BridgeSourceable source2 = new SourceSubB();
        bridge.setSource(source2);
        bridge.method();
    }
}

interface BridgeSourceable {
    public void method();
}
class SourceSubA implements BridgeSourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
class SourceSubB implements BridgeSourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
abstract class Bridge {
    private BridgeSourceable source;

    public void method(){
        source.method();
    }

    public BridgeSourceable getSource() {
        return source;
    }

    public void setSource(BridgeSourceable source) {
        this.source = source;
    }
}

class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
