package com.i2.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String atHome(){
        return  "hello,world";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }

}
