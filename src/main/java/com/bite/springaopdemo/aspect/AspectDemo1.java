package com.bite.springaopdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AspectDemo1 {
    @Pointcut("execution(* com.bite.springaopdemo.controller.*.*(..))")
    public void pt(){};
    @Around("pt()")
    public Object timeRecord(ProceedingJoinPoint pjp) {
        log.info("目标方法执行前...");
        // 执行目标方法
        Object proceed = null;
        try {
            proceed = pjp.proceed();
        } catch (Throwable e) {
            log.error("do Around throwing...");
        }
        log.info("目标方法执行后...");
        return proceed;
    }

    @Before("pt()")
    public void doBefore() {
        log.info("doBefore...");
    }

    @After("pt()")
    public void doAfter() {
        log.info("doAfter...");
    }

    @AfterReturning("pt()")
    public void doAfterReturning() {
        log.info("doAfterReturning...");
    }

    @AfterThrowing("pt()")
    public void doAfterThrowing() {
        log.info("doAfterThrowing...");
    }

}
