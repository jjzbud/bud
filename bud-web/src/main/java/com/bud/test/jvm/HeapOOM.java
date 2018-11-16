package com.bud.test.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *  VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Author jiejz1
 * @Create 2018-11-09
 */
public class HeapOOM {
    static class OOMObject{
    }

    public static void main(String[] args) {
//        List<OOMObject>  list = new ArrayList<OOMObject>();
//        while(true) {
//            list.add(new OOMObject());
//        }

//        int i=0;
//        while(true){
//            String intern = String.valueOf(i++).intern();
//            System.out.println(intern);
//        }

        String str1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuffer("ja").append("va").toString();
        System.out.println(str2.intern() == str2);


    }
}
