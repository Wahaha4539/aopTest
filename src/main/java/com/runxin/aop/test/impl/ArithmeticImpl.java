package com.runxin.aop.test.impl;

import com.runxin.aop.test.Arithmetic;
import org.springframework.stereotype.Component;

/**
 * Created by 1 on 2017/8/3.
 */
@Component(value = "arithmeticImpl")
public class ArithmeticImpl implements Arithmetic{

    public int add(int i, int j) {
        return i+j;
    }

    public int reduce(int i, int j) {
        return i-j;
    }

    public int plus(int i, int j) {
        return i*j;
    }

    public int div(int i, int j) {
        return i/j;
    }
}
