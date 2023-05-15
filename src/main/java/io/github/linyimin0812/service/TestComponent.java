package io.github.linyimin0812.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author yiminlin
 * @date 2023/05/13 20:37
 **/
@Component
public class TestComponent {

    @PostConstruct
    public void init() throws InterruptedException {
        Thread.sleep(20 * 1000);
    }

}
