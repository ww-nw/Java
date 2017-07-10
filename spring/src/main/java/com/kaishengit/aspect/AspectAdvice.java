package com.kaishengit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by 王威 on 2017/7/10.
 */
@Component
@Aspect
public class AspectAdvice {
    @Pointcut("execution(* com.kaishengit.service..*.*(..))")
    public void pointCut(){}

    //@Before("pointCut()")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }
   // @AfterReturning(pointcut = "pointCut()",returning = "result")
    public void afterReturningAdvice(Object result){
        System.out.println("后置通知 :" + result);
    }

   // @AfterThrowing(pointcut="pointCut()",throwing = "e")
    public void afterThrowingAdvice(Exception e) {
        System.out.println("异常通知 :" + e.getMessage());
    }
   // @After("pointCut()")
    public void afterAdvice() {
        System.out.println("最终通知");
    }
    @Around("pointCut()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("arount before");
            //代表目标对象方法的执行
            Object result = proceedingJoinPoint.proceed();
            System.out.println(" arount after returning ");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("arount throwing");
        }finally {
            System.out.println("arount after");
        }

    }



}
