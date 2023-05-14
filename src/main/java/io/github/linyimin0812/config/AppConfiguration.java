package io.github.linyimin0812.config;

import io.github.linyimin0812.service.TestBean;
import io.github.linyimin0812.service.TestBean1;
import io.github.linyimin0812.service.TestBean2;
import io.github.linyimin0812.async.config.AsyncBeanProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yiminlin
 * @date 2023/05/13 20:39
 **/
@Configuration
public class AppConfiguration {

    @Bean(initMethod = "init")
    public TestBean testBean(AsyncBeanProperties properties) {
        return new TestBean();
    }

    @Bean(initMethod = "init")
    public TestBean1 testBean1() {
        return new TestBean1();
    }

    @Bean(initMethod = "init")
    public TestBean2 testBean2() {
        return new TestBean2();
    }

}
