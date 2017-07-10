package com.kaishengit.proxy.com.kaishengit.proxy;

/**
 * Created by 王威 on 2017/7/10.
 */
public class Client {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        LenovoProxy lenoveProxy = new LenovoProxy(lenovo);
        lenoveProxy.sales();
    }
}
