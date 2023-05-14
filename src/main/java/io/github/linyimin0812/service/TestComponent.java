package io.github.linyimin0812.service;

import io.github.linyimin0812.async.annotation.AsyncInit;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author yiminlin
 * @date 2023/05/13 20:37
 **/
@Component
//@AsyncInit
public class TestComponent {

    @PostConstruct
    public void init() throws InterruptedException {
        Thread.sleep(20 * 1000);
    }

}
