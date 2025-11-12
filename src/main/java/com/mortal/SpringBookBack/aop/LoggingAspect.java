package com.mortal.SpringBookBack.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

   @Before("execution (* com.mortal.SpringBookBack.service.JobService.getPost(..)) || execution (* com.mortal.SpringBookBack.service.JobService.getAllJobs(..)) ||  execution (* com.mortal.SpringBookBack.service.JobService.addJobPost(..))")
    public void logMethodCall(JoinPoint joinPoint){
        LOGGER.info("Logging Called"+"  "+ joinPoint.getSignature().getName());
    }

    @After("execution (* com.mortal.SpringBookBack.service.JobService.getPost(..)) || execution (* com.mortal.SpringBookBack.service.JobService.getAllJobs(..)) ||  execution (* com.mortal.SpringBookBack.service.JobService.addJobPost(..))")
    public void logMethodExecuted(JoinPoint joinPoint){
        LOGGER.info("Method Executed"+"  "+ joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution (* com.mortal.SpringBookBack.service.JobService.getPost(..)) || execution (* com.mortal.SpringBookBack.service.JobService.getAllJobs(..)) ||  execution (* com.mortal.SpringBookBack.service.JobService.addJobPost(..))")
    public void logMethodCrashed(JoinPoint joinPoint){
        LOGGER.info("Method Crashed"+"  "+ joinPoint.getSignature().getName());
    }

    @AfterReturning("execution (* com.mortal.SpringBookBack.service.JobService.getPost(..)) || execution (* com.mortal.SpringBookBack.service.JobService.getAllJobs(..)) ||  execution (* com.mortal.SpringBookBack.service.JobService.addJobPost(..))")
    public void logMethodSuccess(JoinPoint joinPoint){
        LOGGER.info("Method Success"+"  "+ joinPoint.getSignature().getName());
    }
}
