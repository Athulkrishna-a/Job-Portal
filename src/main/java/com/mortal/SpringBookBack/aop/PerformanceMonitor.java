package com.mortal.SpringBookBack.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitor {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


    @Around("execution (* com.mortal.SpringBookBack.service.JobService.*(..)) ")
    public Object performanceTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long start=System.currentTimeMillis();

       Object obj= joinPoint.proceed();
        long end= System.currentTimeMillis();
        LOGGER.info("Time Taken"+ "  "  + joinPoint.getSignature().getName()+"  "+ (end-start)+"ms");
        return  obj;
    }
}
