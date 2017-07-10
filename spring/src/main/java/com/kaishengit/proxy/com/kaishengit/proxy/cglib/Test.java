package com.kaishengit.proxy.com.kaishengit.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by 王威 on 2017/7/10.
 */
public class Test {

    public static void main(String[] args) {
        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //指定父类对象(目标对象)
        enhancer.setSuperclass(Mouse.class);
        //指定代理行为(methodInterceptor的实现类)
        enhancer.setCallback(new MyMethodInterceptor());
        //创建代理类(目标对象的子类)(通过父类执指向子类的形式获取目标对象的代理对象)
        Mouse mouse = (Mouse) enhancer.create();
        //父类指向之类调用方法
        mouse.move();
    }
}
