package com.slk;

import com.slk.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(ac.getBean(TestService.class));
		ClassPathXmlApplicationContext xc=new ClassPathXmlApplicationContext("classpath:spring.xml");
		System.out.println(xc.getBean(TestService.class));
	}
}
