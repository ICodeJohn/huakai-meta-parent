package com.huakai.meta.core.service.impl;

import com.huakai.meta.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version ="1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}

