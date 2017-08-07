package com.runxin.aop.test;

import com.runxin.aop.test.impl.ArithmeticImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 1 on 2017/8/3.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Arithmetic arithmetic = (Arithmetic) context.getBean("arithmeticImpl");

        System.out.println("result:"+ arithmetic.add(1, 2));
    }
}
