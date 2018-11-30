package com.bud.test.disignpattern;

/**
 * 描述:
 *      工厂模式（Factory）：
 *
 * @Author jiejz1
 * @Create 2018-11-26
 */
public class Factory {
    public static void main(String[] args) {
        /**
         * 普通工厂模式
         */
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();

        /**
         * 多个工厂方法模式
         */
        SendFactoryMethods factoryMethods = new SendFactoryMethods();
        Sender senderMail = factoryMethods.produceMail();
        senderMail.send();

        /**
         * 静态工厂方法模式调用
         */
        Sender senderMailStatic = SendFactoryStatic.produceMail();
        senderMailStatic.send();


        /**
         *  抽象工厂模式
         */
        Provider provider = new SendMailFactory();
        Sender senderAbstract  = provider.produce();
        senderAbstract.send();


    }
}

interface Sender {
    public void send();
}

class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}

/**
 * 普通工厂模式(Ordinary factory)
 */
class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
/**
 * 多个工厂方法模式(Multiple factory methods)
 */

class SendFactoryMethods {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}

/**
 * 静态工厂方法模式
 */
class SendFactoryStatic {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}

/**
 *  抽象工厂模式 实现接口
 */
interface Provider {
    public Sender produce();
}

/**
 * 多个工厂类
 */
class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
