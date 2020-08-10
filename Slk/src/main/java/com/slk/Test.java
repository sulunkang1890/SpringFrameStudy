package com.slk;



import com.slk.annotationslk.SlkScan;
import com.slk.scanslk.SlkScanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		SlkScanner slkScanner=new SlkScanner(ac);
		slkScanner.addIncludeFilter(null);
		int scan = slkScanner.scan("com.slk");
		System.out.println(scan);


		/***
	 * 直接注入原生对象 到单例容器中没有实现代理
	 */
//	ac.getBeanFactory().registerSingleton("xx",xx.class);
//		System.out.println(ac.getBean("xx"));
//		//		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
//
	}
}
