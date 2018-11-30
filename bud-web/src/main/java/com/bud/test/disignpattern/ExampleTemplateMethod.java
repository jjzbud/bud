package com.bud.test.disignpattern;

/**
 * 描述:
 *  模板方法模式 （Template Method）  父类与子类
 * @Author jiejz1
 * @Create 2018-11-27
 */
public class ExampleTemplateMethod {
    public static void main(String[] args) {
        String exp = "8+8";
        TemplateAbstractCalculator cal = new TemplatePlus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}

abstract class TemplateAbstractCalculator {

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}

class TemplatePlus extends TemplateAbstractCalculator {

    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}

