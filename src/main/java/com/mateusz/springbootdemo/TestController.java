package com.mateusz.springbootdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public HelloWorld hello() {
        return new HelloWorld("world");
    }

    @Getter
    @Setter
    @AllArgsConstructor
    private class HelloWorld {
        String hello;
    }
}
