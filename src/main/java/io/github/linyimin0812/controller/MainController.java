package io.github.linyimin0812.controller;

import io.github.linyimin0812.service.TestBean;
import io.github.linyimin0812.service.TestComponent;
import io.github.linyimin0812.async.AsyncSpringBeanProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiminlin
 * @date 2023/05/13 20:35
 **/
@RestController
public class MainController {

    @Autowired
    private TestBean testBean;

    @Autowired
    private TestComponent testComponent;

    @Autowired
    private AsyncSpringBeanProperties asyncSpringBeanProperties;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
}
