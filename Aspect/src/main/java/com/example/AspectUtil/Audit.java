package com.example.AspectUtil;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Audit {

		private Logger logger = LoggerFactory.getLogger(Audit.class);

		//	@Before("execute(print())")
		@Before("execution(* com.example.AspectUtil.service.impl.BoardServiceImpl.getById(..))")
		public void before(JoinPoint joinPoint) {
				logger.info(" before called " + joinPoint.toString());
		}
}
