package com.bud.test.disignpattern;

/**
 * 描述:
 *  7种结构型模式：适配器模式、装饰模式、代理模式、外观模式、桥接模式、组合模式、享元模式
 *  对象的适配器模式是各种模式的起源
 *  https://blog.csdn.net/zhangerqing/article/details/8239539
 *  适配器模式:
 *      类的适配器模式：
 *          当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
 *          创建一个新类继承原有的类，实现新的接口即可
 *      对象的适配器模式
 *          当希望一个对象转换成满足另一个新接口的对象是，可以创建一个Wrapper类
 *          持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行
 *      接口的适配器模式
 *          当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper,
 *          实现所有的方法，我们写别的类的时候，继承抽象类即可
 */
public class TestAdapter{
    public static void main(String[] args) {
        /**
         *  测试累的适配器模式
         */
//        TargetAble targetClass = new AdapterClass();
//        targetClass.method1();
//        targetClass.method2();
        /**
         * 电对象的适配器模式
         */
//        Source source = new Source();
//        TargetAble targetobject = new Wrapper(source);
//        targetobject.method1();
//        targetobject.method2();

        /**
         * 接口的适配器模式
         */
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();

    }
}

/**
 * 核心思想:
 * 有一个Source类，拥有一个方法，待适配，
 * 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * TargetAble接口的实现类就具有了Source类的功能。
 */
class Source {
    public void method1() {
        System.out.println("this is original method!");
    }
}
interface TargetAble {
    /* 与原类中的方法相同 */
    public void method1();
    /* 新类的方法 */
    public void method2();
}
/**
 * 类的适配器模式
 */
class AdapterClass extends Source implements TargetAble {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
/**
 * 对象的适配器模式
 */
class Wrapper implements TargetAble {
    private Source source;
    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
    @Override
    public void method1() {
        source.method1();
    }
}

/**
 * 接口的适配器模式
 */


interface Sourceable {

    public void method1();
    public void method2();
}

/**
 * Sourceable 接口的抽象类 Wrapper2
 */
abstract class Wrapper2 implements Sourceable{

    public void method1(){}
    public void method2(){}
}

class SourceSub1 extends Wrapper2 {
    public void method1(){
        System.out.println("the sourceable interface's first Sub1!");
    }
}
class SourceSub2 extends Wrapper2 {
    public void method2(){
        System.out.println("the sourceable interface's second Sub2!");
    }
}