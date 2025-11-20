package com.bite.springaopdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
//@Component
public class AspectDemo2 {

    @Before("com.bite.springaopdemo.aspect.AspectDemo1.pt()")
    public void doBefore() {
        log.info("AspectDemo2 doBefore...");
    }

    @After("com.bite.springaopdemo.aspect.AspectDemo1.pt()")
    public void doAfter() {
        log.info("AspectDemo2 doAfter...");
    }
}
