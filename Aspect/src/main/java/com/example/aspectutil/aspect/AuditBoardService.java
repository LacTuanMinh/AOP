package com.example.aspectutil.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditBoardService {

	private Logger logger = LoggerFactory.getLogger(AuditBoardService.class);

	@Pointcut("execution(* com.example.aspectutil.service.impl.BoardServiceImpl.*(..))")
	public void anyMethodRun() {
	}

	@Before("anyMethodRun()")
	public void before(JoinPoint joinPoint) {
		System.out.println("Start: " + joinPoint.toShortString());
	}

	@After("anyMethodRun()")
	public void after(JoinPoint joinPoint) {
		System.out.println("End: " + joinPoint.toShortString());
	}

	@Around(value = "anyMethodRun()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		try {
			 joinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		long end = System.nanoTime();
		long duration = end - start;
		System.out.printf("Duration: %d nanoseconds\n", duration);
	}
}
