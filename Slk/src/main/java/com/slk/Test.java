package com.slk;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
	ac.register(AppConfig.class);
	ac.refresh();
	}
}
