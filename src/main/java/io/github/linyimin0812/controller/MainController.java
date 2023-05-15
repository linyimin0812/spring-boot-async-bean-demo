package io.github.linyimin0812.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiminlin
 * @date 2023/05/13 20:35
 **/
@RestController
public class MainController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
}
