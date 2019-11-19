package com.codefountain.spring.core.aop.basic;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CalculatorLoggingAspect {

    private Logger logger = Logger.getLogger(CalculatorConfiguration.class.getName());

    //@Before("execution(* ArithmeticCalculator.multiplication(..))")
    public void logBefore() {
        logger.info("Before multiplication method");
    }

    //@After("execution(* ArithmeticCalculator.addition(..))")
    public void logAfter() {
        logger.info("After addition method");
    }

    //@AfterReturning(pointcut = "execution(* ArithmeticCalculator.addition(..))", returning = "result")
    public void logAfterReturning(Object result) {
        logger.info("After returning addition method: " + result);
    }

    //@AfterThrowing(pointcut = "execution(* ArithmeticCalculator.division(double, double))", throwing = "exception")
    public void logAfterThrowing(Throwable exception) {
        logger.info("After throwing division method");
        logger.info("Exception message: " + exception.getMessage());
    }

    //@Before("execution(* ArithmeticCalculator.multiplication(..))")
    public void joinPointInfo(JoinPoint joinPoint) {
        logger.info("joinPointInfo Advice");
        logger.info("Kind: " + joinPoint.getKind());
        logger.info("Method signature: " + joinPoint.getSignature().getName());
        logger.info("Declaring type name: " + Arrays.toString(joinPoint.getArgs()));
        logger.info("Target Object: " + joinPoint.getTarget());
        logger.info("This object: " + joinPoint.getThis());
    }

    @Around("execution(* ArithmeticCalculator.multiplication(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Around advice.");
        logger.info("Method arguments: " + Arrays.toString(proceedingJoinPoint.getArgs()));
        Object result;
        try {
            result = proceedingJoinPoint.proceed(new Object[]{5.8, 9.2});
            return result;
        } catch (Throwable throwable) {
            throw throwable;
        }
    }
}
