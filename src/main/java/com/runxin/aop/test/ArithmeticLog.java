package com.runxin.aop.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1 on 2017/8/3.
 */
@Service
@Aspect
public class ArithmeticLog {

    @Before("execution(* com.runxin.aop.test..*.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("method "+methodName+" begins with "+args);
    }
}
