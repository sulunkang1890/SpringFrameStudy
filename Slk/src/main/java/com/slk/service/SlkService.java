package com.slk.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class SlkService implements IService {
	public  SlkService(){
		System.out.println("slkService");
	}
	/**
	 * FactoryBean 和bean 有什么关系
	 * 1.初始化的时机不同
	 */
}
