package com.kaishengit.proxy.com.kaishengit.proxy.jdk;

import com.kaishengit.proxy.com.kaishengit.proxy.Computer;
import com.kaishengit.proxy.com.kaishengit.proxy.Lenovo;

import java.lang.reflect.Proxy;

/**
 * Created by 王威 on 2017/7/10.
 */
public class Test {
    public static void main(String[] args) {
        //创建目标对象
        Lenovo lenovo = new Lenovo();
        //创建InvocationHandler对象
        ComputerInvocationHandler computerInvocationHandler = new ComputerInvocationHandler(lenovo);
        //调用proxy的newProxyInstance方法获取代理对象 (接口指向(动态)代理对象)
        Computer computer = (Computer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(),lenovo.getClass().getInterfaces(),computerInvocationHandler);
        //使用代理对象调用目标对象的方法
        computer.sales();
    }
}
