package com.kuang.method3anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.kuang.method1.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("-------before------");
    }
}
