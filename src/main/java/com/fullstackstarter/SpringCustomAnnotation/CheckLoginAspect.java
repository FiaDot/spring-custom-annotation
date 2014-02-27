package com.fullstackstarter.SpringCustomAnnotation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class CheckLoginAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(CheckLoginAspect.class);
	
	@Around(value="@annotation(com.fullstackstarter.SpringCustomAnnotation.CheckLogin)")
	public Object CheckLogin(ProceedingJoinPoint pjp) throws Throwable {
		logger.warn("check login");
		Object ret = pjp.proceed();
		return ret;
	}
	
}