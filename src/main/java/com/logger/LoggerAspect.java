package com.logger;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggerAspect {


	@Around("@annotation(com.logger.BoundaryLogger)")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getSimpleName();
		long t0 = System.nanoTime();
		Object resp = joinPoint.proceed();
		long t1 = System.nanoTime();

		log.info(className + " :: " + methodName +
				" >>>>>>>> Execution Time Taken " + (t1 - t0) + " nanos");

		return resp;
	}
}
