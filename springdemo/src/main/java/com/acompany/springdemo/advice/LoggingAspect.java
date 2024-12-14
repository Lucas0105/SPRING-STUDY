package com.acompany.springdemo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.acompany.springdemo.controller.UserController.*(..))")
    public Object setLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("실행 시작: "
                            + pjp.getSignature().getDeclaringTypeName() + "."
                            + pjp.getSignature().getName());
        long startMills = System.currentTimeMillis();
        Object result = pjp.proceed();
        long executionMills = System.currentTimeMillis() - startMills;
        System.out.println("실행 완료: " + executionMills + "밀리초 소요됨"
                            + pjp.getSignature().getDeclaringTypeName() + "."
                            + pjp.getSignature().getName());
        return result;
    }

    @Before("execution(* com.acompany.springdemo.service.*.get*(..))")
    public void logger() {
        System.out.println("logger test before service method");
    }
}
