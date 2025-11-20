package com.bite.springaopdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAspectDemo {
    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
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
}
