package com.slk;


import com.slk.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		/**
		 * ac.getBean <=容器.getBean===singletonObjects.et()== map.get
		 * 容器不等于 map
		 * singletonObjects
		 */
//		System.out.println(ac.getBean(TestBeandefintion.class));
		//		ac.start();
		/**
		 * 手动去IOC中注入对象 并且注入的对象中有依赖Sprig 容器的对象
		 */
//		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
//		ac.getBeanFactory().registerSingleton("xx");
//
//
//		System.out.println(ac.getBean(TestServiceV2.class).getiService().hashCode());
//		ac.stop();
		/**
		 * 1.扫描
		 * 2.parse ---------------beanDefinition ----- map<'xx',O>
		 *
		 * 3.validate
		 * 4.life 遍历map 得到 beanDefinition 实例化
		 */

		//System.out.println(ac.getBean(TestService.class).getService().hashCode());
		//System.out.println(ac.getBean(TestService.class).getService().hashCode());
//		ClassPathXmlApplicationContext xc=new ClassPathXmlApplicationContext("classpath:spring.xml");
//		System.out.println(xc.getBean(TestService.class).getiService());
	}
}
