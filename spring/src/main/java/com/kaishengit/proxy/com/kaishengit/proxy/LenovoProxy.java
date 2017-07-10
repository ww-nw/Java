package com.kaishengit.proxy.com.kaishengit.proxy;

/**
 * Created by 王威 on 2017/7/10.
 */
public class LenovoProxy implements Computer {

    //构造方法
    private Computer computer;
    public LenovoProxy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void sales() {
        System.out.println("联想电脑不错...");
        computer.sales();
        System.out.println("送个键盘呗...");
    }
}
