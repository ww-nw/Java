package com.kaishengit.proxy.com.kaishengit.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 王威 on 2017/7/10.
 */
public class ComputerInvocationHandler implements InvocationHandler {
    private Object target;

    public ComputerInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 指定代理对象的代理行为
     * @param proxy
     * @param method  目标对象的当前执行的方法
     * @param args   调用方法带的参数
     * @return       方法执行后的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("电脑涨价了");
        Object result = method.invoke(target,args);
        return result;
    }
}
