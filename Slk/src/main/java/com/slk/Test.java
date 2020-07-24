package com.slk;


import com.slk.service.TestServiceV2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.start();
		/**
		 * 手动去IOC中注入对象 并且注入的对象中有依赖Sprig 容器的对象
		 */
//		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
//		ac.getBeanFactory().registerSingleton("xx");
//		ac.register(AppConfig.class);
//		ac.refresh();
//		System.out.println(ac.getBean(TestServiceV2.class).getiService().hashCode());
//		ac.stop();

		//System.out.println(ac.getBean(TestService.class).getService().hashCode());
		//System.out.println(ac.getBean(TestService.class).getService().hashCode());
//		ClassPathXmlApplicationContext xc=new ClassPathXmlApplicationContext("classpath:spring.xml");
//		System.out.println(xc.getBean(TestService.class).getiService());
	}
}
