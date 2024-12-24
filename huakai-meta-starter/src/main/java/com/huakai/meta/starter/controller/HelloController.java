package com.huakai.meta.starter.controller;

import com.huakai.meta.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(version = "1.0.0")
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return helloService.sayHello(name);
    }
}