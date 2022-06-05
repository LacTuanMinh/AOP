package com.example.AspectUtil;

import com.example.AspectUtil.service.BoardService;
import com.example.AspectUtil.service.impl.BoardServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AspectApplication {
//	void print() {
//		System.out.println("Main");
//	}

	public static void main(String[] args) {
		SpringApplication.run(AspectApplication.class, args);
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			BoardService hello = (BoardServiceImpl) context.getBean("hello");
			hello.getById(1L);
	}

}
