package com.bud.test.disignpattern;

/**
 * 描述:
 *  装饰模式（Decorator[ˈdekəreɪtə(r)] ）: 装饰模式就是给一个对象增加一些新的功能，而且是动态的
 *  要求装饰对象和被装饰对象实现同一个接口，装饰对象之一被装饰对象的实例
 *  适用场景：
 *      1.需要扩展一个类的功能
 *      2.动态的为一个类增加功能，而且还能动态撤销。
 *      缺点：产生过多相似的对象，不易拍错！
 * @Create 2018-11-27
 */
public class TestDecorator {
    public static void main(String[] args) {
        DecoratorSource source = new DecoratorSource();
        DecoratorSourceable obj = new Decorator(source);
        obj.method();
    }
}

interface DecoratorSourceable {
    public void method();
}
class DecoratorSource implements DecoratorSourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

class Decorator implements DecoratorSourceable {

    private DecoratorSource source;

    public Decorator(DecoratorSource source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
