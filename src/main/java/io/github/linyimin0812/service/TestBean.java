package io.github.linyimin0812.service;


import io.github.linyimin0812.async.annotation.AsyncInit;

/**
 * @author yiminlin
 * @date 2023/05/13 20:38
 **/
//@AsyncInit
public class TestBean {
    public void init() throws InterruptedException {
        Thread.sleep(20 * 1000);
    }
}
