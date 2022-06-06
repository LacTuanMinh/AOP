package com.example.aspectutil;

import com.example.aspectutil.service.BoardService;
import com.example.aspectutil.service.impl.BoardServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectApplication.class, args);
	}

}
