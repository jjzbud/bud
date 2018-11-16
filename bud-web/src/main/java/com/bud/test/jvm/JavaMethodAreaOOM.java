package com.bud.test.jvm;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 描述:
 * VN Args: -Xmx20m -XX:MaxDirectMemorySize=10M
 * @Author jiejz1
 * @Create 2018-11-09
 */
public class JavaMethodAreaOOM {
    private static final int _1Mb = 1024 * 1024;
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        while(true) {
            unsafe.allocateMemory(_1Mb);
        }

//        while (true){
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(OOMObject.class);
//            enhancer.setUseCache(false);
//            enhancer.setCallback(new MethodInterceptor() {
//                @Override
//                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                    return methodProxy.invokeSuper(o, args);
//                }
//            });
//            enhancer.create();
//        }
    }
    static class OOMObject {

    }
}
