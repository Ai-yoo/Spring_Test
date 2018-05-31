package com.du.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/5/30
 * @Time 21:31
 */
@Aspect

public class Advisor {

    @Pointcut("execution(* *.test(..))")
    public void test() {

    }

    //方法之前
    @Before("test()")
    public void before() {
        System.out.println("----before----");
    }

    //方法之后
    @After("test()")
    public void after() {
        System.out.println("----after----");
    }

    //方法的前后执行
    @Around("test()")
    public Object around(ProceedingJoinPoint p) {
        System.out.println("环绕之前");
        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕之后");
        return o;
    }

}
