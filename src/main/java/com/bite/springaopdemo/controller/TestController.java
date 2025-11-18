package com.bite.springaopdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/test")
@RestController
public class TestController {
    @RequestMapping("/t1")
    public Integer t1() {
        log.info("执行t1");
//        int a = 10 / 0;
        return 1;
    }
    @RequestMapping("/t2")
    public Boolean t2() {
        log.info("执行t2");
        return true;
    }
    @RequestMapping("/t3")
    public String t3() {
        log.info("执行t3");
        return "t3";
    }
}
