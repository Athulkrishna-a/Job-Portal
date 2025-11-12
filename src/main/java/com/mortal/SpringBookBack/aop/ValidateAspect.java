package com.mortal.SpringBookBack.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidateAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution (* com.mortal.SpringBookBack.service.JobService.getPost(..)) && args(postId) ")
    public Object validateAndUpdate(ProceedingJoinPoint joinPoint , int postId) throws Throwable {
        if(postId < 0){
            LOGGER.info("Typed Input"+ " "+postId);
            postId = -postId;
            LOGGER.info("Corrected"+ " "+postId);
        }
        Object obj = joinPoint.proceed(new Object[]{postId});

        return obj;
    }

}
