package io.github.linyimin0812.service;

import io.github.linyimin0812.async.annotation.AsyncInit;

/**
 * @author yiminlin
 * @date 2023/05/14 15:27
 * @description TODO:
 **/
@AsyncInit
public class TestBean2 {
    public void init() throws InterruptedException {
        Thread.sleep(10 * 1000);
    }
}
